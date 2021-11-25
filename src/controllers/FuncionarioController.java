package controllers;
import models.Funcionario;

public class FuncionarioController {
    
    public static Funcionario addFuncionario (String nome,int id, int idade ,String genero, String funcao, String filial, String turno){
        Funcionario f1 = new Funcionario;

        return f1;
    }

    public static void removeFuncionario (Integer indice, ArrayList<Funcionario> funcionarios){
        funcionarios.remove(indice);
    }

    public static Funcionario modFuncionario (String nome,int id, int idade ,String genero, String funcao, String filial, String turno){
        return addFuncionario(nome, id, idade, genero, funcao, filial, turno);
    }

    public static void listFuncionario (ArrayList<Funcionario> funcionarios){
        for(Funcionario funcionarios : funcionario){
            System.out.println("Nome" + funcionario.nome + "ID:" + funcionario.id + "Idade: "+ funcionario.idade + "Genêro:" + funcionario.genero + "Função" + funcionario.funcao + "Flilial: " + funcionario.filial + "Turno :" + funcionario.turno);
        }
    }
}
