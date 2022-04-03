/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.ArrayList;

/**
 *
 * @author OSHIKURU
 */
public class Medico extends javax.swing.JFrame{
     // Declarando variaveis
    private int numeroMedicos;
    private String nome;
    private String especialidade;
   

    

    // Contructor Vazio
    public Medico() {
    }
    
    // Contructor com paramentros
    public Medico(int numeroMedicos, String nome, String especialidade) {
        this.numeroMedicos = numeroMedicos;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    
    // Metodos Get e set
    public int getNumeroMedicos() {
        return numeroMedicos;
    }

    public void setNumeroMedicos(int numeroMedicos) {
        this.numeroMedicos = numeroMedicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

  
    
    
    
    
    
}
