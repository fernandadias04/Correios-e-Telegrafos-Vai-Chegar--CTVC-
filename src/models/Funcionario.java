/**
 * Funcionario
 */

package models;

public class Funcionario {

    private String nome; 
    private Integer id;
    private String filial;
    
    
    public Funcionario(String nome, Integer id, String filial){

        this.nome = nome;
        this.id = id;
        this.filial = filial;
    

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id ){
        this.id = id;
    }

    
    public String getFilial(){
        return filial;
    }

    public void setFilial(String filial){
        this.filial = filial;
    }



}