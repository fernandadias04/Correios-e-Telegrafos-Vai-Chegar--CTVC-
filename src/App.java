import java.util.ArrayList;

import controllers.*;
import models.Funcionario;
import views.MenuFuncionario;
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioController funcionarioController = new FuncionarioController(funcionarios);
        MenuFuncionario menuFuncionario = new MenuFuncionario(funcionarioController);

        menuFuncionario.menu();


        System.out.println("");
    }
}
