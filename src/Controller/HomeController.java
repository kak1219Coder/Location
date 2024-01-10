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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class HomeController implements Initializable {
   private Parent fxml;
   
   @FXML 
   
   private AnchorPane root;
   @FXML 
   void accueil(){
       try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Accueil.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void contrals(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Contrats.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void factures(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Facture.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void historique(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Historique.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void locations(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Location.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void logements(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Logements.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @FXML 
   void locataires(){
        try {
           fxml = FXMLLoader.load(getClass().getResource("/Interface/Locataires.fxml"));
           root.getChildren().removeAll();
           root.getChildren().setAll(fxml);
       } catch (IOException ex) {
           Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
              accueil();
    }    
    
}
