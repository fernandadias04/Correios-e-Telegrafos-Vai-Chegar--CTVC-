package controllers;
import models.Funcionario;
import java.util.ArrayList;

public class FuncionarioController {

    public ArrayList<Funcionario> funcionarios;

    public FuncionarioController(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    
    public Funcionario addFuncionario (String nome,int id, String filial){
        Funcionario f1 = new Funcionario( nome, id,  filial);
        funcionarios.add(f1);
        return f1;
    }

    public void removeFuncionario (Integer indice){
        Funcionario funcionario = funcionarios.get(indice);
        funcionarios.remove(funcionario);
    }

    public Funcionario modFuncionario (String nome,int id,  String filial){
        return addFuncionario(nome, id, filial);
    }

    public void listFuncionario (){
        for (int counter = 0; counter < funcionarios.size(); counter++) {
            Funcionario funcionario = funcionarios.get(counter);
            System.out.println("Indice: "+ counter + " Nome: " + funcionario.getNome() + " ID: " + funcionario.getId()  + " Filial: " + funcionario.getFilial());
        }
    }

    
}
