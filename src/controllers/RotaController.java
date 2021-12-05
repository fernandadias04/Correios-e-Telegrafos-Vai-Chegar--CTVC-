package controllers;

import java.util.ArrayList;
import models.Rota;

public class RotaController {
    
    public ArrayList<Rota>rotas;

    public RotaController(ArrayList<Rota>rotas){
        this.rotas = rotas;
    }

    public Rota add(String rota, Integer id){
        Rota r1 = new Rota(id, rota);
        rotas.add(r1);
        return r1;
    }

    public void remove(Integer indice){
        Rota rota = rotas.get(indice);
        rotas.remove(rota);
    }

    public void list(){
        for(int i =0; i<rotas.size(); i++){
            Rota rota = rotas.get(i);
            System.out.println("Rota: " + rota.getRota() + " Id: " + rota.getId());
        }
    }

    public Boolean verifica(Integer indice){
        try{
            rotas.get(indice);
            return true;

        }catch(IndexOutOfBoundsException e) {
            return false;
        }  
    }

    public Rota encontra(Integer indice){
        return rotas.get(indice);
    }

    public void editRota(Rota rota, String caminho){
        rota.setRota(caminho);
    }

    public void editId(Rota rota, Integer id){
        rota.setId(id);
    }
}
