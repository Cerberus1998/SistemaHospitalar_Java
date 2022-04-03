/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.Frame;
import java.awt.List;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OSHIKURU
 */
public class ConexaoBD {
    
    private final static String DRIVER = "com.mysql.jdbc.Driver";//Driver
    private final static String URL = "jdbc:mysql://localhost:3306/hospital";//caminho da base de dado
    private final static String USER = "root";//usuario
    private final static String PASS = "";//Senha

    //iniciar coneao
    public static Connection getConnection(){
        
        try {
            forName(DRIVER);
            try {
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            //iniciar secção
            throw new RuntimeException("Erro na Conexão", ex);
            
        } 
        return null;
    }
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Encerrando conexão
     public static void closeConnection(Connection con, PreparedStatement stmt){
        //Con conexão, stmt preparando paramentros
         closeConnection(con);
            try {
                
                if(stmt != null){
                     stmt.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
     
      public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
          
         closeConnection(con, stmt);
            try {
                
                if(rs != null){
                     rs.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}
