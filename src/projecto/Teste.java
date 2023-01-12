/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineList;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;
/**
 *
 * @author MG
 */
public class Teste extends Application {
    
    
    private Synthesizer synthesizer;
     Voice voice = null;
    public Teste() {
       
	    
	    
        try {
            synthesizer = Central.createSynthesizer(null);
            synthesizer.allocate();
            synthesizer.resume();
        } catch (IllegalArgumentException | EngineException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (AudioException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (EngineStateError e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    public void sayIt(String phrase) {
        try {
            synthesizer.speakPlainText(phrase, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }
    
}
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
    }

   
    public static void main(String[] args) {
        launch(args);
        Teste t=new Teste();
        t.sayIt("Ola pessoal");
    }
    
}
