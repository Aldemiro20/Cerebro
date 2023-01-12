/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Preloader;
import javafx.application.Preloader.ProgressNotification;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author MG
 */
public class PrincipalController implements Initializable {

    /**
     * Initializes the controller class
     */
    @FXML
    private Button btn_d,btn_g,btn_c,btn_di,btn_de,btn_s,btn_fechar;
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        btn_c.setOnMouseClicked((MouseEvent e)->{
        Calculadora c=new Calculadora();
       
        try{
            c.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    });
        btn_g.setOnMouseClicked((MouseEvent e)->{
        Guia g=new Guia();
       
        try{
            g.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        } 
    });
        btn_d.setOnMouseClicked((MouseEvent e)->{
        Dicionarioo d=new Dicionarioo();
       
        try{
            d.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        } 
    });
        btn_di.setOnMouseClicked((MouseEvent e)->{
        Dicas di=new Dicas();
       
        try{
            di.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    });
        btn_d.setOnMouseClicked((MouseEvent e)->{
        Dicionarioo d=new Dicionarioo();
       
        try{
            d.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    });
        btn_de.setOnMouseClicked((MouseEvent e)->{
        Definicoes de=new Definicoes();
       
        try{
            de.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    });
        btn_d.setOnMouseClicked((MouseEvent e)->{
        Dicionarioo d=new Dicionarioo();
       
        try{
            d.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    });
        btn_s.setOnMouseClicked((MouseEvent e)->{
        Sobre s=new Sobre();
       
        try{
            s.start(new Stage());
        }catch(Exception ex){
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE,null,ex);
        }   
    });
        btn_fechar.setOnMouseClicked((MouseEvent e)->{  
       System.exit(0);
       
        });
        
        
    }    
    
}
