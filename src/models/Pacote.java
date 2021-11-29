package models;

public class Pacote {
    private String destinatario;
    private String emissor;
    private Integer id;
    private Integer rota;
    private String localizacao;
    private String estadoEntregue;

    public Pacote(String destinatario, String emissor, Integer id, Integer rota, String localizacao, String estadoEntregue) {
        this.destinatario = destinatario;
        this.emissor = emissor;
        this.id = id;
        this.rota = rota;
        this.localizacao = localizacao;
        this.estadoEntregue = estadoEntregue;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
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


    public Integer getRota(){
        return rota;
    }

    public void setRota( Integer rota){
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
