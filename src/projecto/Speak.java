/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author MG
 */
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
 
public class Speak implements Runnable {
    private Sintetizador syn;
    private String word;
 
    public Speak(){
        syn = new Sintetizador();
    }
 
    public void Falar(){
        syn.Falar(word);
    }
 
    public String getWord() {
        return word;
    }
 
    public void setWord(String word) {
        this.word = word;
    }
 
    @Override
    public void run() {
        Falar();
    }
 
}

