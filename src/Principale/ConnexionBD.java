
package Principale;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kak1219
 */
public class ConnexionBD {
    
    Connection conn=null;
    
    public static Connection Connexion()
    {
        try
        {
            // chargement du pilote jbdc 
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loctionlogement","root","");
                if(conn !=null)
                    System.out.println("la connexion a ete  etablir avec succec");
                else
                    System.out.println("Probleme de connexion ");
            
            return conn;
        }catch(Exception e)
        {
            System.out.println("--> SQLException : "+e);
            return null;
        }
    }
        
    }