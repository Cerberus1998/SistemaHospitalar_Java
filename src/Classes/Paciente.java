/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author OSHIKURU
 */
public class Paciente extends javax.swing.JFrame{
     private int numeroLivroMedico;
    private String nome;
    private String bi;
    private String sexo;
    private String dataNascimento;
    private Consulta consul;
    
    
    // Contructor Vazio

    /**
     *
     */
    public Paciente() {
    }

    // Contructor com paramentros

    /**
     *
     * @param numeroLivroMedico
     * @param nome
     * @param bi
     * @param sexo
     * @param dataNascimento
     */
    public Paciente(int numeroLivroMedico, String nome, String bi, String sexo, String dataNascimento) {
        this.numeroLivroMedico = numeroLivroMedico;
        this.nome = nome;
        this.bi = bi;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    // Metodos get e set

    /**
     *
     * @return
     */
    public int getNumeroLivroMedico() {
        return numeroLivroMedico;
    }

    /**
     *
     * @param numeroLivroMedico
     */
    public void setNumeroLivroMedico(int numeroLivroMedico) {
        this.numeroLivroMedico = numeroLivroMedico;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getBi() {
        return bi;
    }

    /**
     *
     * @param bi
     */
    public void setBi(String bi) {
        this.bi = bi;
    }

    /**
     *
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * @return
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     *
     * @param dataNascimento
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Consulta getConsul() {
        return consul;
    }

    public void setConsul(Consulta consul) {
        this.consul = consul;
    }
    
    
    
}
