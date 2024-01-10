/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Principale.ConnexionBD;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class SignInController implements Initializable {
     Connection con =null;
     public PreparedStatement ps =null;
     public ResultSet rs =null;
    
     @FXML 
     private TextField txtUser;     
     @FXML
     private PasswordField txtPass;

     @FXML 
     private Button btnOublie;
     @FXML 
     private Button btnConnecter;
     @FXML 
     private VBox VBox;
     private Parent fxml;
      @FXML 
      
      void openHome(){
          String nom = txtUser.getText();
          String passe = txtPass.getText();
          String sql ="select userName, password from admin";
         try {
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             if(rs.next())
             {
                   if(nom.equals(rs.getString("userName")) && passe.equals(rs.getString("password")))
                {
                   System.out.println("bienvenueol");
                  VBox.getScene().getWindow().hide();
                   Stage home = new Stage();
              try {
                  fxml= FXMLLoader.load(getClass().getResource("/Interface/Home.fxml"));
                  Scene scene = new Scene(fxml);
                  home.setScene(scene);
                  home.show();
              } catch (IOException ex) {
                  ex.printStackTrace();
                  ps.close();
                 rs.close();
              }
               
              
                }else{
                       Alert alert = new Alert(AlertType.ERROR, "le non d'utilisteur ou le mot de est incorrecte",ButtonType.OK );
                       alert.showAndWait();
                   }  
             }
         } catch (SQLException ex) {
             
             Logger.getLogger(SignInController.class.getName()).log(Level.SEVERE, null, ex);
         }
          
        
          
      }
      @FXML 
      void sendPassword(){
     
      }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con=ConnexionBD.Connexion();
       
    }    
    
}
