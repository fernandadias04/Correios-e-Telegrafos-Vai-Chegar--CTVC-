package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class MenuFuncionario {

    private FuncionarioController controller;
    private Scanner sc;


    public MenuFuncionario (FuncionarioController controller, Scanner sc){
        this.controller = controller;
        this.sc = sc;
    }

    public void menu(){

        Integer opcao;

        do{
            System.out.println("");
            System.out.println("---------------MENU----------------");
            System.out.println("1-Cadastrar Funcionario");
            System.out.println("2-Excluir Funcionario");
            System.out.println("3-Listar Funcionarios");
            System.out.println("4-Editar Funcionario");
            System.out.println("0-Retornar ao menu principal");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){              
                case 1:                    
                    adicionar();
                    break;

                case 2:                     
                    excluir();
                    break;

                case 3:    
                    listar();
                    break;
                    
                case 4: 
                    editar();
                    break;
            }


        }while(opcao != 0);
    }

    public void adicionar(){

        System.out.println("Nome do Funcionario:");
        String nome = sc.nextLine();
        System.out.println("Id do Funcionario:");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Filial do Funcionario:");
        String filial = sc.nextLine();

        controller.addFuncionario(nome, id, filial);

        
    }

    public void excluir(){
        

        System.out.println("Qual o indice do funcionario a ser excluido?");
        Integer indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verificaFuncionario(indice)){
            System.out.println("Funcionario não encontrado, inserir funcionario válido");
            
            return;
        }

        controller.removeFuncionario(indice);

        
    }

    public void listar(){
        controller.listFuncionario();
    }

    public void editar(){
        

		Integer opcao;
        Integer indice;
        

        System.out.print("Qual o indice do Funcionario a ser editado?");
        indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verificaFuncionario(indice)){
            System.out.println("Funcionario não encontrado, inserir funcionario válido");
            
            return;
        }

        System.out.println("Funcionario encontrado!");

        Funcionario funcionario = controller.encontraFuncionario(indice);

        do{
            System.out.println("");
            System.out.println("---------------MENU EDITAR----------------");
            System.out.println("1-Editar nome de "+ funcionario.getNome());
            System.out.println("2-Editar o id atual:  " + funcionario.getId());
            System.out.println("3-Editar a filial atual: " + funcionario.getFilial());
            System.out.println("0-Retornar ao menu anterior");

            
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){              
                case 1:                    
                    System.out.println("Digite o novo nome do Funcionario");
                    String nome = sc.nextLine();
                    controller.editarNome(funcionario, nome);
                    break;

                case 2:                     
                    System.out.println("Digite o novo ID do Funcionario");
                    Integer id = sc.nextInt();
                    sc.nextLine();
                    controller.editarId(funcionario, id);
                    break;

                case 3:    
                    System.out.println("Digite a nova filial do Funcionario");
                    String filial = sc.nextLine();
                    controller.editarFilial(funcionario, filial);
                    break;
                    
            }


        }while(opcao != 0);

        
    }

    
}
