/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Principale.ConnexionBD;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AccueilController implements Initializable {
    Connection con =null;
     public PreparedStatement ps =null;
     public ResultSet rs =null;
       @FXML
    private Label lbldis;

    @FXML
    private JFXTextField txtloyer;

    @FXML
    private ImageView imglog;

    @FXML
    private JFXTextField txtsuperficie;

    @FXML
    private JFXTextField txtregion;

    @FXML
    private MaterialDesignIconView suivant;

    @FXML
    private MaterialDesignIconView precedant;

    @FXML
    void showPresedant() {

    }

    @FXML
    void showSuivant() {

    }
   public void showLogement(){
       String sql = "select count(*) from logement where idLogement not in(select logement from location)";
       
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i =0;
            
            if(rs.next())
            {
                i=rs.getInt(1);
            }
            lbldis.setText(Integer.toString(i));
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql2 = "select loyer, superficie, nomRegion from logement, region where region.idRegion = logement.region and idLogemet not in(select logement from location)";
        try {
            ps =con.prepareStatement(sql2);
            rs = ps.executeQuery();
            if(rs.next())
            {
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccueilController.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con = ConnexionBD.Connexion();
       showLogement();
    }    
    
}
