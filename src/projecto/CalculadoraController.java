/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import animatefx.animation.Bounce;
import animatefx.animation.FadeIn;
import animatefx.animation.FadeInDown;
import animatefx.animation.FadeInRight;
import animatefx.animation.FadeOut;
import animatefx.animation.FadeOutUp;
import animatefx.animation.Flash;
import animatefx.animation.Hinge;
import animatefx.animation.JackInTheBox;
import animatefx.animation.Jello;
import animatefx.animation.SlideInDown;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInRight;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MG
 */
public class CalculadoraController implements Initializable {
    double valor1=0;
    double valor2=0;
    int resultado=0;
    double resultado_d=0;
    
    String operacao ="";

    @FXML
    private Button seteButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button umButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button doisButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button noveButton;
    @FXML
    private Button zeroButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button somaButton;
    @FXML
    private Button subtrairButton;
    @FXML
    private Button dividirButton;
    @FXML
    private Button multiplicarButton;
    @FXML
    private Button apagarButton,btn_fechar;
    @FXML
    private TextField textfield;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Sintetizador s=new Sintetizador();
                              
        // TODO
         btn_fechar.setOnMouseClicked((MouseEvent e)->{
        btn_fechar.getScene().getWindow().hide();
        
    });
        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "1");
                 new Bounce(textfield).play();
            }
        });
        doisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "2");
                new FadeIn(textfield).play();
            }
        });
        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "3");
                new FadeInDown(textfield).play();

            }
        });
        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "4");
                new FadeInRight(textfield).play();
            }
        });
        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "5");
                new FadeIn(textfield).play();
            }
        });
        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "6");
                new Bounce(textfield).play();
            }
        });
        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "7");
                new Flash(textfield).play();
            }
        });
        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "8");
               new FadeIn(textfield).play();
            }
        });
        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "9");
                new FadeIn(textfield).play();
            }
        });
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textfield.setText(textfield.getText() + "0");
                new Bounce(textfield).play();
            }
        });
        multiplicarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operacao="*";
                  new Jello(textfield).play();
            }
        });
         somaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operacao="+";
               new Jello(textfield).play();
            }
        });
 subtrairButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operacao="-";
                 new Jello(textfield).play();
            }
        });
 dividirButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operacao="/";
                 new Jello(textfield).play();
            }
        });
  apagarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor1=0;
                valor2=0;
                textfield.setText("");
                operacao="";
                 new Flash(textfield).play();
            }
        });
   igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2=Double.parseDouble(textfield.getText());
                 
                switch(operacao){
                   
                    case "+":
                            resultado=(int) (valor1+valor2);
                            textfield.setText(String.valueOf(resultado));
                            
                            s.Falar(String.valueOf(resultado));
                            
                            break;
                    case "-":
                            resultado=(int) (valor1-valor2);
                            textfield.setText(String.valueOf(resultado));
                             
                             s.Falar(String.valueOf(resultado));
                            break;
                    case "*":
                        
                            resultado=(int) (valor1*valor2);
                            textfield.setText(String.valueOf(resultado));
                            
                             s.Falar(String.valueOf(resultado));
                            
                           
                            break;
                    case "/":
                            resultado_d=(valor1/valor2);
                            textfield.setText(String.valueOf(resultado_d));
                             s.Falar(String.valueOf(resultado_d));
                            
                            break;        
                }
                operacao="";
                valor1=0;
                valor2=0;
                
            }
        });




    }

}
