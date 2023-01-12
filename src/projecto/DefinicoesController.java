/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author MG
 */
public class DefinicoesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private ImageView btn_audio,btn_video,btn_definicoes;
    @FXML private AnchorPane d_audio,d_video,d_definicoes;
    @FXML private RadioButton d_activardi; 
    
   
    
    
 @FXML private void handleButtonAction (MouseEvent event){
        if(event.getTarget()==btn_audio){
          d_audio.setVisible(true); 
          d_video.setVisible(false);
          d_definicoes.setVisible(false);
          
        }
        else 
            if(event.getTarget()==btn_video){
            d_video.setVisible(true);
            d_audio.setVisible(false); 
          d_definicoes.setVisible(false);
        }
        else 
                if(event.getTarget()==btn_definicoes){
            d_definicoes.setVisible(true);
             d_video.setVisible(false);
            d_audio.setVisible(false); 
          
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
