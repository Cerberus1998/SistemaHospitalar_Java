/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Classes.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OSHIKURU
 */
public class ControleMedico {
    
     public void create(Medico M){
   
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt= null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO medico (nome,especialidade) Values (?,?)");
            stmt.setString(1,M.getNome());
            stmt.setString(2,M.getEspecialidade());
            
                    
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
                ConexaoBD.closeConnection(con, stmt);
        }
        
        }
     
     
     //Preencendo a tabela Medicos
     
     
     
      public ArrayList<Medico> read(){
        
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt= null;
        ResultSet rs = null;
        
        ArrayList<Medico> medicos = new ArrayList<>();
        
        try {  
            stmt = con.prepareStatement("SELECT * FROM medico");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Medico medico = new Medico();
                medico.setNumeroMedicos(rs.getInt("id"));
                medico.setNome(rs.getString("nome"));
                medico.setEspecialidade(rs.getString("especialidade"));
                
                
                medicos.add(medico);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleMedico.class.getName()).log(Level.SEVERE, null, ex);
        }// finally usado para fechar tudo incluindo a conexão
        finally{
            ConexaoBD.closeConnection(con, stmt, rs);
        }
        
        
       return medicos;
    }
    
}
