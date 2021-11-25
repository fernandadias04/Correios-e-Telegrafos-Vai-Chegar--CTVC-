package controllers;
import models.Pacote;

public class PacoteController {

    public static Pacote addPaconte(String remetente, String emissor, Integer id, String rota, String localizacao, String estadoEntregue){
        Pacote p1 = new Pacote( remetente,  emissor,  id,  rota,  localizacao,  estadoEntregue);

        return p1;
    }

    public static void removePacote (Integer indice, ArrayList<Pacote> pacotes){
        pacotes.remove(indice);
    }

    public static Pacote modPacote(String remetente, String emissor, Integer id, String rota, String localizacao, String estadoEntregue){
        return addPaconte(remetente, emissor, id, rota, localizacao, estadoEntregue);
    }
    
    public static void listPacote( ArrayList<Pacote> pacotes){
        for(Pacote pacotes : pacote){
            System.out.println("Remetente:" + pacote.remetente + "ID:" + pacote.id + "Emisssor: " + pacote.emissor + "Rota" + pacote.rota + "Estado Entregue: " + pacote.estadoEntregue + "Localização :" + pacote.localizacao );
        }
    }
