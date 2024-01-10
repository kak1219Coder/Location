/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class MainController implements Initializable {
     @FXML
    private Button btnConnecter;

     @FXML
    private Button btnInscrire;
     @FXML
    private VBox VBox;
     private Parent fxml; 
     @FXML
    void openSignIn() {
         TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
         t.setToX(VBox.getLayoutX() * 5.5);
         t.play();
         t.setOnFinished(e ->{
             try {
                 fxml = FXMLLoader.load(getClass().getResource("/Interface/SignIn.fxml"));
                 VBox.getChildren().removeAll();
                 VBox.getChildren().setAll(fxml);
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
             
         
         });

    }

    @FXML
    void openSignUp() {
         TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
         t.setToX(5);
         t.play();
         t.setOnFinished(e ->{
             try {
                 fxml = FXMLLoader.load(getClass().getResource("/Interface/SignUp.fxml"));
                 VBox.getChildren().removeAll();
                 VBox.getChildren().setAll(fxml);
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
             
         
         });
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         TranslateTransition t = new TranslateTransition(Duration.seconds(1), VBox);
         t.setToX(VBox.getLayoutX() * 5.5);
         t.play();
           t.setOnFinished(e ->{
             try {
                 fxml = FXMLLoader.load(getClass().getResource("/Interface/SignIn.fxml"));
                 VBox.getChildren().removeAll();
                 VBox.getChildren().setAll(fxml);
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
           });
           }
    
}
