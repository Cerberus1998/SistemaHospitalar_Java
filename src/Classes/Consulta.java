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
public class Consulta extends javax.swing.JFrame{
    // Declarando Variaveis
    private String dataConsulta;
    private int informaçãoMedico;
    private int informaçãoPaciente;
    ArrayList<Paciente> ListaPaciente;
    

    
    // Contructor Vazio

    /**
     *
     */
    //Criando Listas
    public Consulta() {
        
        ListaPaciente = new ArrayList();
    }

    // Contructor com parametros

    /**
     *
     * @param dataConsulta
     * @param informaçãoMedico
     * @param informaçãoPaciente
     */
    public Consulta(String dataConsulta, int informaçãoMedico, int informaçãoPaciente) {
        this.dataConsulta = dataConsulta;
        this.informaçãoMedico = informaçãoMedico;
        this.informaçãoPaciente = informaçãoPaciente;
       
        ListaPaciente = new ArrayList();
    }

    // Metodos get e set

    /**
     *
     * @return
     */
    public String getDataConsulta() {
        return dataConsulta;
    }

    /**
     *
     * @param dataConsulta
     */
    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    /**
     *
     * @return
     */
    public int getInformaçãoMedico() {
        return informaçãoMedico;
    }

    /**
     *
     * @param informaçãoMedico
     */
    public void setInformaçãoMedico(int informaçãoMedico) {
        this.informaçãoMedico = informaçãoMedico;
    }

    /**
     *
     * @return
     */
    public int getInformaçãoPaciente() {
        return informaçãoPaciente;
    }

    /**
     *
     * @param informaçãoPaciente
     */
    public void setInformaçãoPaciente(int informaçãoPaciente) {
        this.informaçãoPaciente = informaçãoPaciente;
    }

  

    public ArrayList<Paciente> getListaPaciente() {
        return ListaPaciente;
    }

    public void setListaPac(ArrayList<Paciente> ListaPaciente) {
        this.ListaPaciente = ListaPaciente;
    }
    
 
    public void addPaciente(Paciente P){
        P.setConsul(this);   
        ListaPaciente.add(P);
    }
    
}
