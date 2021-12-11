package views;

import java.util.Scanner;

import controllers.RotaController;
import models.Rota;


public class MenuRota {

    private RotaController controller;
    private Scanner sc;

    public MenuRota(RotaController controller, Scanner sc){
        this.controller = controller;
        this.sc = sc;
    }

    public void menuRota(){
		Integer opcao;

        do{
            System.out.println("");
            System.out.println("----------MENU-ROTAS---------");
            System.out.println("1- Criar Rota");
            System.out.println("2- Editar Rotas");
            System.out.println("3- Listar Rotas");
            System.out.println("4- Excluir Rota");
            System.out.println("0- Voltar ao menu principal");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){              
                case 1:                    
                    adicionar();
                    break;


                case 2: 
                    editar();
                    break;


                case 3:    
                    listar();
                    break;
                
                case 4:                     
                    excluir();
                    break;
    
                
            }


        }while(opcao!=0);

    }

    public void adicionar(){
        System.out.println("Id da Rota");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Adicionar cidades da rota");
        String rota = sc.nextLine();

        controller.add(rota, id);
    }

    public void excluir(){
        System.out.println("Qual o indice da rota a ser excluido?");
        Integer indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verifica(indice)){
            System.out.println("Rota não encontrada, inserir Rota válida");
            
            return;
        }

        controller.remove(indice);;
    }


    public void listar(){
        controller.list();
    }

    public void editar(){
        Integer opcao;
        Integer indice;

        System.out.print("Qual o indice da rota a ser editado?");
        indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verifica(indice)){
            System.out.println("Rota não encontrada, inserir Rota válida");
            
            return;
        }

        System.out.println("Rota encontrada!");

       Rota rota = controller.encontra(indice);

       do{
        
        System.out.println("");
        System.out.println("----MENU-EDITAR-----");
        System.out.println("1- Editar Id: " + rota.getId());
        System.out.println("2- Editar Rota :" + rota.getRota());

        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1:

                System.out.println("Digite novo Id da rota:");
                Integer id = sc.nextInt();
                sc.nextLine();

                controller.editId(rota, id);
                break;
            
            case 2:

                System.out.println("Digite nova rota:");
                String caminho = sc.nextLine();

                controller.editRota(rota, caminho);
                break;
        }

       }while(opcao !=0);
    
    }
}
