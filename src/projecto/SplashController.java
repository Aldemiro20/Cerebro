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
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author MG
 */
public class SplashController implements Initializable {
    
        @FXML
        private ProgressBar progressbar;
        public static ProgressBar statprogressbar;
        @FXML
        private Label carregando;
        public static Label label;
        
        
       
                
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        label=carregando;
        statprogressbar=progressbar;
    }    
    
}
