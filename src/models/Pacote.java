package models;

public class Pacote {
    private String remetente;
    private String emissor;
    private Integer id;
    private String rota;
    private String localizacao;
    private String estadoEntregue;

    public Pacote(String remetente, String emissor, Integer id, String rota, String localizacao, String estadoEntregue) {
        this.remetente = remetente;
        this.emissor = emissor;
        this.id = id;
        this.rota = rota;
        this.localizacao = localizacao;
        this.estadoEntregue = estadoEntregue;
    }

    public String getRemetente(){
        return remetente;
    }

    public void setRemetente(String remetente){
        this.remetente = remetente;
    }

    public String getEmissor(){
        return emissor;
    }

    public void setEmissor(String emissor){
        this.emissor = emissor;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }


    public String getRota(){
        return rota;
    }

    public void setRota( String rota){
        this.rota = rota;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public String getEstadoEntregue(){
        return estadoEntregue;
    }

    public void setEstadoEntregue(String estadoEntregue){
        this.estadoEntregue = estadoEntregue;
    }





}
