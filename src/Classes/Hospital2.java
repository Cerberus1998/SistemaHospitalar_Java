/*
V * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;
//importação da lista java
import java.util.ArrayList;

/**
 *
 * @author OSHIKURU
 */
public class Hospital2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando lista para armazezar os dados inseridos pelo usuario
        ArrayList<Medico> Med =new ArrayList();
        ArrayList<Paciente> Pac =new ArrayList();
        ArrayList<Consulta> Con =new ArrayList();
      
        // Para permitir entrada de valores
        Scanner objscanner = new Scanner(System.in);
        
       
        
        int opcao;
        
       
        // Criando o menu
        do {
            System.out.println("\n***********************************");
        System.out.println("###HOSPITAL###\n");
        System.out.println("1- Cadastrar Medico");
        System.out.println("2- Cadastrar Paciente");
        System.out.println("3- Cadastrar Consulta");
        System.out.println("4- Mostrar lista de consulta marcada");
        System.out.println("5- Sair");
        opcao = objscanner.nextInt();
        
        // Editando a primeira opção do menu
        switch (opcao) {
            case 1:{ 
                int op=0;
            do{  
                
                 Medico m1= new Medico();
                 
                    // Pedindo dados do Medico
                    System.out.println("Digite o numero do Medicos: ");
                    int numMed=objscanner.nextInt();
                    m1.setNumeroMedicos(numMed);
              
                    System.out.println("Digite o nome do Medicos: ");
                    String nomeMed=objscanner.next();
                    m1.setNome(nomeMed);

                    System.out.println("Digite a especialidade do Medicos: ");
                    String espMed=objscanner.next();
                    m1.setEspecialidade(espMed);
                    
                    // Adicionando os dados do medico a lista
                    Med.add(m1);
                    System.out.println("CADASTRADO COM SUCESSO");
                
                    // Perguntando ao utilizador se gostaria de adicionar mais medico ou sair
                        System.out.println("1- Add  **** 2-Sair");
                        op=objscanner.nextInt();
                     System.out.println("*************************************");
               
            }while(op!=2);
        
    
            }
                break;
                // Editando a segunda opção do menu
            case 2: { 
                int op=0;
                System.out.println("###CADASTRAR PACIENTES###\n");
            do{  
                
                 Paciente p1= new Paciente();
                    
                    //Editando a lista do paciente
                    System.out.println("Digite o numero Livro Medico");
                    int numeroLivroMedico=objscanner.nextInt();
                    p1.setNumeroLivroMedico(numeroLivroMedico);
                    
                    System.out.println("Digite o Nome do Paciente: ");
                    String nome=objscanner.next();
                    p1.setNome(nome);
                    
                    System.out.println("Digite o Bi: ");
                    String bi=objscanner.next();
                    p1.setBi(bi);

                    System.out.println("Digite o sexo: ");
                    String sexo=objscanner.next();
                    p1.setSexo(sexo);
                    
                    System.out.println("Digite a Data: ");
                    String date=objscanner.next();
                    p1.setDataNascimento(date);
                    
                    // Adicionando os dado do paciente a lista criada anteriomente com o nome p1(pacientes1)
                    Pac.add(p1);
                        
                    // Perguntando mais uma vez ao utilizador se gostaria de adicionar mais um paciente a base de dados ou se gostaria de sair
                    System.out.println("CADASTRADO COM SUCESSO");
                
                    System.out.println("1- Add  **** 2-Sair");
                    op=objscanner.nextInt();
                        
                System.out.println("*************************************");
            // Fim da edição da segunda opção
               
            }while(op!=2);
        
    
            }
                break;
          
               
                // Editando o terceiro item do menu
                case 3: {
                
                    int op=0;
                   do{ 
                       //Criando atributos  para receber valores de atributos criados nas classe
                       //codepac(condigo do paciente) para nº de livro medico do paciente
                       //codetmed(codigo do medico) para nº do medico
                    int countpac=0;
                    int countmed=0;
                    int codePac;
                    int codeMed;
                    Consulta c1= new Consulta();
                    
                    // Criando consulta de acordo com as informações dos medicos e pacientes já criados
                    System.out.println("###CADASTRAR CONSULTA###\n");
                    
                    do{
                        // Condição do paciente
                    System.out.println("Digite o cod. do paciente:");
                    codePac=objscanner.nextInt();
                        
                    for(int i=0; i<Pac.size();i++){
                        if(Pac.get(i).getNumeroLivroMedico()==codePac){
                            countpac++;
                        }
                    }
                    if(countpac<1)
                        System.out.println("****Paciente não existe****");
                    }while(countpac<1);
                    
                    //Condiçao do Medico
                    do{
                    System.out.println("Digite o cod. do medico:");
                    codeMed=objscanner.nextInt();
                    
                    //Condição do medico
                    for(int i=0; i<Med.size();i++){
                        if(Med.get(i).getNumeroMedicos()==codeMed){
                            countmed++;
                        }
                    }
                    if(countmed<1)
                        System.out.println("****Medico não existe****");
                    }while(countmed<1);
                    //Data da consulta
                    System.out.println("Digite a data da consulta:");
                    String dataCon=objscanner.next();
                    
                    c1.setInformaçãoPaciente(codePac);
                    c1.setInformaçãoMedico(codeMed);
                    c1.setDataConsulta(dataCon);
                    
                    Con.add(c1);
                    
                    System.out.println("CONSULTA MARCADA COM SUCESSO");
                    
                    //Perguntando ao utilizador se gostaria de adicionar mais alguma consulta
                    System.out.println("1- Add  **** 2-Sair");
                        op=objscanner.nextInt();
                        
                System.out.println("*************************************");
            
               
            }while(op!=2);
                    
                    
                   
                }
                   
                  // Editando o quarto item do menu
                break;
                
                case 4: {
                    
                    System.out.println("###LISTA DAS CONSULTAS###");
                    
                    for (int i = 0; i < Con.size(); i++) {
                        
                        // Listando os dados da consulta
                        System.out.println("\n****************Consulta numero: "+(i+1)+"****************");
                        
                        System.out.println("+-Data Consulta: "+Con.get(i).getDataConsulta());
                        
                        // Listando os dados do paciente segundo 
                        for(int j=0; j<Pac.size();j++){
                            if(Pac.get(j).getNumeroLivroMedico()==Con.get(i).getInformaçãoPaciente()){
                                System.out.println("---Cod. Paciente:"+Pac.get(j).getNumeroLivroMedico());
                                System.out.println("---Nome Paciente:"+Pac.get(j).getNome());
                                System.out.println("---BI Paciente:"+Pac.get(j).getBi());
                                System.out.println("---Sexo Paciente:"+Pac.get(j).getSexo());
                                System.out.println("---Data Nascimento do Paciente:"+Pac.get(j).getDataNascimento());
                            }
                        }
                        
                        //Listando os dados do medico
                        for(int j=0; j<Med.size();j++){
                            if(Med.get(j).getNumeroMedicos()==Con.get(i).getInformaçãoMedico()){
                                System.out.println("++Codigo Medico:"+Med.get(j).getNumeroMedicos());
                                System.out.println("++Nome Medico:"+Med.get(j).getNome());
                                System.out.println("++Especialidade:"+Med.get(j).getEspecialidade());
                                
                                //
                            }
                        }
                        System.out.println("- - - - - -- -- --------------------");
                    }
                    
                }
               // Fim da execução
                break;
                
            default:
                //Fim dos casos ou das opções do menu
        }
        } while (opcao!= 5);
        //Fim do menu
        
    }
    
}
