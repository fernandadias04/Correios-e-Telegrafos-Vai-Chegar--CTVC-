package models;

public class Veiculo {
    protected String modelo;
    protected Integer ano;
    protected Integer id;
    protected Integer rotaAssociada;

    public Veiculo(String modelo, Integer ano, Integer id, Integer rotaAssociada) {
        this.modelo = modelo;
        this.ano = ano;
        this.id = id;
        this.rotaAssociada = rotaAssociada;
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


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getRotaAssociada(){
        return rotaAssociada;
    }

    public void setRotaAssociada(Integer rotaAssociada){
        this.rotaAssociada = rotaAssociada;
    }

}
