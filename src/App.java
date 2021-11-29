import java.util.ArrayList;
import controllers.*;
import models.Funcionario;
import models.Pacote;
import views.MenuFuncionario;
import views.MenuPacote;
public class App {
    public static void main(String[] args) throws Exception {


        // ArrayList<Funcionario> funcionarios = new ArrayList<>();
        // FuncionarioController funcionarioController = new FuncionarioController(funcionarios);
        // MenuFuncionario menuFuncionario = new MenuFuncionario(funcionarioController);

        ArrayList<Pacote> pacotes = new ArrayList<>();
        PacoteController pacoteController = new PacoteController(pacotes) ;
        MenuPacote menuPacote = new MenuPacote(pacoteController);

        menuPacote.menu();


        // menuFuncionario.menu();


        System.out.println("");
    }
}
