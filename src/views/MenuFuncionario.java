package views;

import java.util.Scanner;

import controllers.FuncionarioController;

public class MenuFuncionario {

    private FuncionarioController controller;

    public MenuFuncionario (FuncionarioController controller){
        this.controller = controller;
    }

    public void menu(){

        Scanner sc = new Scanner(System.in);
		int opcao;

        do{

            System.out.println("1-Cadastrar Funcionario");
            System.out.println("2-Excluir Funcionario");
            System.out.println("3-Listar Funcionarios");
            System.out.println("0-Retornar ao menu principal");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: 
                    System.out.println("Nome do Funcionario:");
                    String nome = sc.nextLine();
                    System.out.println("Id do Funcionario:");
                    Integer id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Filial do Funcionario:");
                    String filial = sc.nextLine();

                    controller.addFuncionario(nome, id, filial);

                    break;

                case 3:
                    controller.listFuncionario();
                
                    break;
            }


        }while(opcao != 0);

        sc.close();
    }
}
