/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import animatefx.animation.Flash;
import animatefx.animation.Jello;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


/**
 * FXML Controller class
 *
 * @author MG
 */




public class DicionariooController implements Initializable {

    @FXML
    private TextField textp;
    @FXML
    private Button buttonp,btn_fechar;
    String a="";
    
    /**
     * Initializes the controller class.
     */
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Sintetizador s=new Sintetizador();
         btn_fechar.setOnMouseClicked((MouseEvent e)->{
        btn_fechar.getScene().getWindow().hide();
        
    });
        
       buttonp.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent event) {
                 
              a=textp.getText();
                
                switch(a){
                    
           case "abaixar":
               s.Falar("abaixar. Verbo transitivo, que significa, Tornar menor em altura ou intensidade. Dirigir algo para o chão.");
               break;
           case "abalado":
               s.Falar("abalado. Adjetivo, que significa, que sofreu abalo, estremecimento. Chocado, assustado; comovido.");
               break;
           case "abafar":
               s.Falar("abafar. Verbo transitivo, que significa, Impedir a circulação do ar.");
               break;
           case "aborto":
               s.Falar("aborto. Ato ou efeito de abortar, Interrupção da gestação.");
               break;
           case "abreviar":
               s.Falar("abreviar. Verbo transitivo, que significa, Tornar breve, encurtar. Diminuir, resumir, reduzir.");
               break;
            case"acalmar":
                s.Falar("acalmar. Verbo transitivo, que significa tornar calmo, sereno; tranquilizar; pacificar.");
                break;
               
            case"acessível":
                s.Falar("acessível. Adjetivo, que significa A que se tem ou se pode ter acesso; fácil de atingir.");
                break;
            case "aconselhar":
                s.Falar("aconselhar. Verbo transitivo, que significa Dar conselho a. ndicar, recomendar, sugerir. Procurar convencer, persuadir.");
                break;
            case"acontecer":  
               s.Falar("acontecer. verbo intrasitivo, que significa Tornar-se realidade; suceder inesperadamente; ocorrer.");
               break;
            case "adolescência":
                s.Falar("adolescência. Fase da vida humana entre a puberdade e a idade adulta, caracterizada por mudanças corporais e psicológicas.");
                break;
            case"aeroporto":
                s.Falar("aeroporto. Campo de pouso e decolagem de aviões, com instalações técnicas e comerciais necessárias ao tráfego aéreo, à manutenção das aeronaves e ao embarque e desembarque de passageiros e de carga; campo de aviação, aeródromo.");
                break;
            case"cerebro":
                s.Falar("seja bem vindo ao cérebro, o sistema que da voz nos teus problemas");
                break;
            case"algoritmo":
                s.Falar("algoritmo.Sequência predefinida de regras, raciocínios ou operações que produz uma solução para determinado tipo de problema.");
                break;
            case"amizade":
                s.Falar("amizade. Sentimento de estima, simpatia e admiração entre pessoas.");
                break;
            case"buraco":
                s.Falar("buraco. Cavidade ou espaço vazio em uma superfície ou em um corpo.");
                break;
            case"calculadora":
                s.Falar("Calculadora. Máquina que efetua operações aritméticas.");
                break;
            case"campanha":    
                s.Falar("campanha. Conjunto de ações, de esforços, para");
                break;
            case "capacidade":  
                s.Falar("capacidade. Conjunto de qualidades que permitem a alguém fazer alguma coisa.");
                break;
               
       }
            }
       });
       
       
}
}