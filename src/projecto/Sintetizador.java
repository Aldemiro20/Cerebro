/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineList;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.SynthesizerProperties;
import javax.speech.synthesis.Voice;

/**
 *
 * @author MG
 */
public class Sintetizador extends Application {
    
    Synthesizer synth = null;
    Voice voice = null;
    
    public Sintetizador() {
	
	try {
	    
	    EngineList list = Central.availableSynthesizers(null);
	    SynthesizerModeDesc desc = null;
	    for(int i=0;i<list.size();i++) {
		desc = (SynthesizerModeDesc)list.elementAt(i);
		Voice[] voices = desc.getVoices();
		for(int j=0;j<voices.length;j++) {
		    if(voices[j].getName().indexOf("SAPI5") > 0) {
			voice = voices[j];
			break;
		    }
		}
	    }
	    
	    if(voice == null) {
		System.out.println("O sistema não consegue encontrar a voz SAPI5, verifique se tem instalado na sua maquina!");
		System.exit(0);
	    }
	    
	    synth = Central.createSynthesizer(desc);
	    synth.allocate();
	    synth.resume();
	    synth.waitEngineState(Synthesizer.ALLOCATED);
	    System.out.println("Using voice "+voice);
	    SynthesizerProperties props = synth.getSynthesizerProperties();
	    props.setVoice(voice); 
            
	    
	} catch(Exception e) {
	    e.printStackTrace();
	}finally{
            
        }
    }
    public void Falar(String phrase) {
        try {
            synth.speakPlainText(phrase, null);
            synth.waitEngineState(Synthesizer.QUEUE_EMPTY);
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    

     
    
    @Override
    public void start(Stage primaryStage) {
      
 
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}

