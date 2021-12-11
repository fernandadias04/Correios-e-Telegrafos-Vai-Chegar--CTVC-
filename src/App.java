import java.util.ArrayList;
import controllers.*;
import models.*;
import views.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioController funcionarioController = new FuncionarioController(funcionarios);
        MenuFuncionario menuFuncionario = new MenuFuncionario(funcionarioController, sc);

        ArrayList<Pacote> pacotes = new ArrayList<>();
        PacoteController pacoteController = new PacoteController(pacotes) ;
        MenuPacote menuPacote = new MenuPacote(pacoteController, sc);

        ArrayList<Rota> rotas = new ArrayList<>();
        RotaController rotaController = new RotaController(rotas);
        MenuRota menuRota = new MenuRota(rotaController, sc);

        ArrayList<Veiculo> veiculos  = new ArrayList<>();
        VeiculoController veiculoController = new VeiculoController(veiculos);
        MenuVeiculo menuVeiculo = new MenuVeiculo(veiculoController, sc);


        MenuCarteiro menuCarteiro = new MenuCarteiro(pacoteController, sc);

       
       Integer op;

        do{
            System.out.println("--------MENU-----");
            System.out.println("1- Menu Funcionarios");
            System.out.println("2- Menu Pacotes");
            System.out.println("3- Menu Rotas");
            System.out.println("4- Menu Veiculos");
            System.out.println("5- Menu Carteiro");
            System.out.println("0- Sair");

            
            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    menuFuncionario.menu();
                    break;

                case 2:
                    menuPacote.menuPacote();
                    break;

                case 3:
                    menuRota.menuRota();
                    break;

                case 4:
                    menuVeiculo.menu();
                    break;

                case 5:
                    menuCarteiro.menucarteiro();
                    break;

                   
            }

        }while(op!= 0);
 
        sc.close();

    }
}
