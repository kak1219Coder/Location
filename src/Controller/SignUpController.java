/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Principale.ConnexionBD;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class SignUpController implements Initializable {
     Connection con =null;
     public PreparedStatement ps =null;
     public ResultSet rs =null;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      con =ConnexionBD.Connexion();
    }    
    
}
