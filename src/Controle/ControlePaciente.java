/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Classes.Paciente;
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
public class ControlePaciente {
    
     public void create(Paciente P){
   
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt= null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO clientes (nome,bi,dataNascimento,sexo) Values (?,?,?,?)");
            stmt.setString(1,P.getNome());
            stmt.setString(2,P.getBi());
            stmt.setString(3,P.getDataNascimento());
            stmt.setString(4,P.getSexo());
            
                    
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
                ConexaoBD.closeConnection(con, stmt);
        }
        
        }
     
     
     //Preencendo a tabela Medicos
     
     
     
      public ArrayList<Paciente> read(){
        
        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt= null;
        ResultSet rs = null;
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        try {  
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                Paciente paciente = new Paciente();
                paciente.setNumeroLivroMedico(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setBi(rs.getString("bi"));
                paciente.setDataNascimento(rs.getString("dataNascimento"));
                paciente.setSexo(rs.getString("sexo"));
                
                
                pacientes.add(paciente);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlePaciente.class.getName()).log(Level.SEVERE, null, ex);
        }// finally usado para fechar tudo incluindo a conexão// finally usado para fechar tudo incluindo a conexão
        finally{
            ConexaoBD.closeConnection(con, stmt, rs);
        }
        
        
       return pacientes;
    }
    
}
