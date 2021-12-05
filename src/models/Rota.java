package models;

public class Rota {
    private Integer id; 
    private String rota;

    public Rota(Integer id, String rota){
        this.id = id;
        this.rota = rota;
    }

    public String getRota(){
        return rota;
    }

    public void setRota(String rota){
        this.rota = rota;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
}
