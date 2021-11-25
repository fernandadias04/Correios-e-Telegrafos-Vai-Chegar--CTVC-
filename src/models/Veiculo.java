package models;

public class Veiculo {
    protected String modelo;
    protected Integer ano;
    protected Integer id;
    protected String condicoes;

    public Veiculo(String modelo, Integer ano, Integer id, String condicoes) {
        this.modelo = modelo;
        this.ano = ano;
        this.condicoes = condicoes;
        this.id = id;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
       this.modelo = modelo;
    }

    public Integer getAno(){
        return ano;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public String getCondicoes(){
        return condicoes;
    }

    public void setCondicoes(String condicoes){
        this.condicoes = condicoes;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

}
