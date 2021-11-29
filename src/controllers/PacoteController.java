package controllers;
import models.Pacote;
import java.util.ArrayList;

public class PacoteController {

    public ArrayList<Pacote>pacotes;

    public PacoteController(ArrayList<Pacote>pacotes){
        this.pacotes = pacotes;
    }

    public Pacote add(String destinatario, String emissor, Integer id, Integer rota, String localizacao, String estadoEntregue){
        Pacote p1 = new Pacote( destinatario,  emissor,  id,  rota,  localizacao,  estadoEntregue);
        pacotes.add(p1);
        return p1;
    }

    public void remove (Integer indice){
        Pacote pacote = pacotes.get(indice);
        pacotes.remove(pacote);
    }
    
    public void list(){
        for(int counter = 0; counter < pacotes.size(); counter ++ ){
            Pacote pacote = pacotes.get(counter);
            System.out.println("Destinatário: " + pacote.getDestinatario() + "ID: " + pacote.getId() + "Emisssor: " + pacote.getEmissor() + "Rota: " + pacote.getRota() + "Estado Entregue: " + pacote.getEstadoEntregue() + "Localização: " + pacote.getLocalizacao() );
        }
    }

    public Boolean verifica(Integer indice){
        try{
            pacotes.get(indice);
            return true;
        } catch(IndexOutOfBoundsException e) {
            return false;
        }   
    }

    public Pacote encontraPacote (Integer indice){
        return pacotes.get(indice);
    }

    public void editarEmissor(Pacote pacote, String emissor){
        pacote.setEmissor(emissor);
    }

    public void editardestinatario(Pacote pacote, String destinatario){
        pacote.setDestinatario(destinatario);
    }

    public void editarId(Pacote pacote, Integer id){
        pacote.setId(id);
    }

    public void editarRota(Pacote pacote, Integer rota){
        pacote.setRota(rota);
    }

    public void editarLocalizacao(Pacote pacote, String localizacao){
        pacote.setLocalizacao(localizacao);
    }

    public void editarEstadoEntregue(Pacote pacote, String estadoEntregue){
        pacote.setEstadoEntregue(estadoEntregue);
    }


}