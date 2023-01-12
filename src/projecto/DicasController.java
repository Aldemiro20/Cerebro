/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecto;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author MG
 */
public class DicasController implements Initializable {

    @FXML
    private Button btn_fechar;

      @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         btn_fechar.setOnMouseClicked((MouseEvent e)->{
        btn_fechar.getScene().getWindow().hide();
        
    });
   
        
       
    }  

    
}
