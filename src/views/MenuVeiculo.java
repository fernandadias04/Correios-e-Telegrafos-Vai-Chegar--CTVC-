package views;
import java.util.Scanner;

import controllers.VeiculoController;
import models.Veiculo;

public class MenuVeiculo {

    private VeiculoController controller;
    private Scanner sc;

    public MenuVeiculo (VeiculoController controller){
        this.controller = controller;
    }

    public void menu(){

        sc = new Scanner(System.in);
		Integer opcao;

        do{
            System.out.println("");
            System.out.println("---------------MENU----------------");
            System.out.println("1- Cadastrar Veículo");
            System.out.println("2- Editar veiculo");
            System.out.println("3- Excluir Veículo");
            System.out.println("4- Listar Veículo");
            System.out.println("0- Retornar ao menu");

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

        sc.close();
    }

    public void adicionar(){
        System.out.println("Id do veiculo");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Modelo do Veículo");
        String modelo = sc.nextLine();
        System.out.println("Ano do Veículo");
        Integer ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Rota Associada");
        Integer rotaAssociada = sc.nextInt();
        sc.nextLine();

        controller.addVeiculo(modelo, ano, id, rotaAssociada);
    }

    public void excluir(){
        System.out.println("Qual o indice do veiculo a ser excluido?");
        Integer indice = sc.nextInt();
        sc.nextLine();

        controller.removeVeiculo(indice);
    }

    public void listar(){
        controller.listVeiculo();
    }

    public void editar(){
        Integer opcao;
        Integer indice;

        System.out.print("Qual o indice do Veículo a ser editado?");
        indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verifica(indice)){
            System.out.println("Veículo não encontrado, inserir veículo válido");
            
            return;
        }

        System.out.println("Veículo encontrado!");

        Veiculo veiculo = controller.encontra(indice);
        
        do{
            System.out.println("");
            System.out.println("---------------MENU EDITAR----------------");
            System.out.println("1- Editar Id do Veículo: " + veiculo.getId());
            System.out.println("2- Editar Modelo do Veículo" + veiculo.getModelo());
            System.out.println("3- Editar Ano do Veículo"+ veiculo.getAno());
            System.out.println("4- Editar Rota Associada do Veículo"+ veiculo.getRotaAssociada());

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite novo Id do veiculo:");
                    Integer id = sc.nextInt();
                    sc.nextLine();
                    controller.editarId(veiculo, id);
                    break;
                
                    case 2:
                        System.out.println("Digite novo Modelo do Veículo");
                        String modelo = sc.nextLine();
                        controller.editarModelo(veiculo, modelo);
                        break;
                    
                    case 3:
                        System.out.println("Digite o Ano do Veículo");
                        Integer ano = sc.nextInt();
                        sc.nextLine();
                        controller.editarAno(veiculo, ano);
                        break;

                    case 4:
                        System.out.println("Digite o Rota Associada do Veículo");
                        Integer rotaAssociada = sc.nextInt();
                        sc.nextLine(); 
                        controller.editarRota(veiculo, rotaAssociada);   
                        break;

            }

        }while (opcao != 0);
    }
    
}
