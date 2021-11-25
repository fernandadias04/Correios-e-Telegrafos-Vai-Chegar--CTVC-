/**
 * Funcionario
 */

package models;

public class Funcionario {

    private String nome; 
    private Integer id;
    private Integer idade;
    private String genero;
    private String funcao;
    private String filial;
    private String turno;
    
    public Funcionario(String nome, Integer id, Integer idade, String genero, String funcao, String filial, String turno){

        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.funcao = funcao;
        this.filial = filial;
        this.turno = turno;

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

    public Integer getIdade(){
        return idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getFuncao(){
        return funcao;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getFilial(){
        return filial;
    }

    public void setFilial(String filial){
        this.filial = filial;
    }

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }


}