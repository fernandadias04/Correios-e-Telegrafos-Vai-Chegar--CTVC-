package views;

import controllers.PacoteController;
import models.Pacote;
import java.util.Scanner;


public class MenuPacote {
    private PacoteController controller;
    private Scanner sc;

    public MenuPacote (PacoteController  controller){
        this.controller = controller;
    }

    public void menu(){

        sc = new Scanner(System.in);
		Integer opcao;

        do{

            System.out.println("");
            System.out.println("---------------MENU-DE-ENCOMENDAS----------------");
            System.out.println("1-Cadastrar Pacote");
            System.out.println("2-Excluir Pacote");
            System.out.println("3- Editar informações do Pacote");
            System.out.println("4-Receber Pacote em Filial");
            System.out.println("5- Ver todos os pacotes");
            System.out.println("0- Voltar ao menu principal");


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
                    editar();
                    break;

                case 4:
                    break;

                case 5:
                    listar();
                    break;
            }


        }while(opcao!=0);

        sc.close();
    }

    public void adicionar(){
        System.out.println("Nome do Rementente");
        String destinatario = sc.nextLine();
        System.out.println("Nome do Destinatário");
        String emissor = sc.nextLine();
        System.out.println("Id do pacote");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Rota de Entrega");
        Integer rota = sc.nextInt();
        sc.nextLine();
        System.out.println("Localização Atual");
        String localizacao = sc.nextLine();
        System.out.println("Já está entregue?");
        String  estadoEntregue = sc.nextLine();

        controller.add(destinatario, emissor, id, rota, localizacao, estadoEntregue);
    }

    public void listar(){
        controller.list();
    }

    public void excluir(){
        

        System.out.println("Qual o indice do pacote a ser excluido?");
        Integer indice = sc.nextInt();
        sc.nextLine();
        controller.remove(indice);

        
    }

    public void editar(){
       

        Integer opcao;
        Integer indice;
        

        System.out.print("Qual o indice do Funcionario a ser editado?");
        indice = sc.nextInt();
        sc.nextLine();

        if(!controller.verifica(indice)){
            System.out.println("Funcionario não encontrado, inserir funcionario válido");
            
            return;
        }

        System.out.println("Funcionario encontrado!");

        Pacote pacote = controller.encontraPacote(indice);
        do{
            System.out.println("1-Editar Nome do Destinatário: " + pacote.getDestinatario());
            System.out.println("2-Editar Nome do Rementente : " + pacote.getEmissor());
            System.out.println("3-Ediar Id do pacote: " + pacote.getId());
            System.out.println("4-Editar Rota de Entrega: " + pacote.getRota());
            System.out.println("5-Editar Localização Atual: " + pacote.getLocalizacao());
            System.out.println("6-Editar status de entrega: " + pacote.getEstadoEntregue());


        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1:
                System.out.println("Digite o nome do Destinatario:");
                String destinatario = sc.nextLine();
                controller.editardestinatario(pacote, destinatario);
                break;
            
            case 2:
                System.out.println("Digite o nome do Remetente: ");
                String emissor = sc.nextLine();
                controller.editarEmissor(pacote, emissor);
                break;
            
            case 3: 
                System.out.println("Digite o ID do pacote: ");
                Integer id = sc.nextInt();
                sc.nextLine();
                controller.editarId(pacote, id);
                break;
            
            case 4:
                System.out.println("Digite a nova rota de entrega: ");
                Integer rota = sc.nextInt();
                sc.nextLine();
                controller.editarRota(pacote, rota);
                break;

            case 5:
                System.out.println("Digite localização atual: ");
                String localizacao = sc.nextLine();
                controller.editarLocalizacao(pacote, localizacao);
                break;
            
            case 6:
                System.out.println("Digite o status de Entrega: ");
                String estadoEntregue = sc.nextLine();
                controller.editarEstadoEntregue(pacote, estadoEntregue);
                break;
            
        }

       }while(opcao != 0);
    }
    
}
