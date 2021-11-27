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

    

    public void listFuncionario (){
        for (int counter = 0; counter < funcionarios.size(); counter++) {
            Funcionario funcionario = funcionarios.get(counter);
            System.out.println("Indice: "+ counter + " Nome: " + funcionario.getNome() + " ID: " + funcionario.getId()  + " Filial: " + funcionario.getFilial());
        }
    }

    public Boolean verificaFuncionario(Integer indice){
        try {
            funcionarios.get(indice);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }   
    }

    public Funcionario encontraFuncionario(Integer indice){
       return funcionarios.get(indice);
    }

    public void editarNome(Funcionario funcionario, String nome ){
        funcionario.setNome(nome);
    }

    public void editarId(Funcionario funcionario, Integer id ){
        funcionario.setId(id);
    }

    public void editarFilial(Funcionario funcionario, String filial ){
        funcionario.setFilial(filial);
    }

    
}
