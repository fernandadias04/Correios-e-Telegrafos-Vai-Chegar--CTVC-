package views;
import java.util.Scanner;
import controllers.PacoteController; 
import models.Pacote;

public class MenuCarteiro {

    private PacoteController controller;

    private Scanner sc;

    public MenuCarteiro (PacoteController  controller){
        this.controller = controller;
    }

    public void menucarteiro(){
        
        Integer op;
        sc = new Scanner(System.in);

        do{
            System.out.println("");
            System.out.println("----------MENU-CAERTEIRO---------");
            System.out.println("1- Coletar Pacote/Carta em Filial");
            System.out.println("2- Registrar como Entregue");
            System.out.println("3- Não entregue, devolução à filial");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){              
                case 1:
                    coleta();
                    break;
                case 2: 
                    entregar();
                    break;

                case 3: 
                    devolver();
                    break;
            }

        }while(op!=0);

        sc.close();
    };

    public void coleta(){
        Integer indice; 

        System.out.println("Qual o indice do pacote que foi coletado?");
        indice = sc.nextInt();
        sc.nextLine();
        controller.encontraPacote(indice);

        if(!controller.verifica(indice)){
            System.out.println("Pacote não encontrado, inserir Pacote válido");
            
            return;
        }

        System.out.println("Pacote encontrado!");
        Pacote pacote = controller.encontraPacote(indice);

        String pacoteColetado = "SIM";
        controller.editarPacoteColetado(pacote, pacoteColetado);

   
        String estadoEntregue = "EM ROTA DE ENTREGA";
        controller.editarEstadoEntregue(pacote, estadoEntregue);

        System.out.println("Pacote Coletado!");
    }

    public  void entregar() {
        Integer indice; 

        System.out.println("Qual o indice do pacote que foi entregue?");
        indice = sc.nextInt();
        sc.nextLine();
        controller.encontraPacote(indice);

        if(!controller.verifica(indice)){
            System.out.println("Pacote não encontrado, inserir Pacote válido");
            
            return;
        }

        System.out.println("Pacote encontrado!");

        Pacote pacote = controller.encontraPacote(indice);
        String estadoEntregue = "ENTREGUE AO DESTINATARIO";
        controller.editarEstadoEntregue(pacote, estadoEntregue);

        System.out.println("Pacote Entregue!");
    }

    public void devolver(){
        Integer indice; 

        System.out.println("Qual o indice do pacote que foi Devolvido?");
        indice = sc.nextInt();
        sc.nextLine();
        controller.encontraPacote(indice);

        

        if(!controller.verifica(indice)){
            System.out.println("Pacote não encontrado, inserir Pacote válido");
            
            return;
        }

        System.out.println("Pacote encontrado!");

        Pacote pacote = controller.encontraPacote(indice);

        String estadoEntregue = "DEVOLVIDO A FILIAL";
        controller.editarEstadoEntregue(pacote, estadoEntregue);

        String pacoteColetado = "NAO";
        controller.editarPacoteColetado(pacote, pacoteColetado);

        System.out.println("Pacote Devolvido!");
    }
}
