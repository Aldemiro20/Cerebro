/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;
import animatefx.animation.Bounce;
import animatefx.animation.BounceInLeft;
import animatefx.animation.BounceInUp;
import animatefx.animation.FadeIn;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.speech.EngineList;

/**
 *
 * @author MG
 */
public class Dicionarioo extends Application{
    
    @Override   
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Dicionarioo.fxml"));
         stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        new BounceInUp(root).play ();
      Speak syn = new Speak();
    Thread tsyn = new Thread(syn);
    syn.setWord("Olá, seja bem vindo ao Dicionario vocal do cérebro. Por favor digite a palavra que pretende pesquisar...");
    tsyn.start();
        
        
       
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
       
       
    
    }
    }
    

