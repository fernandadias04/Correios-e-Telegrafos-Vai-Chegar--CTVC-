package controllers;
import models.Veiculo;
import java.util.ArrayList;

/**
 * VeiculoController
 */
public class VeiculoController {

    public ArrayList<Veiculo> veiculos;

    public VeiculoController(ArrayList<Veiculo> veiculos){
        this.veiculos = veiculos;
    }

    public  Veiculo addVeiculo (String modelo, Integer ano, Integer id, Integer rotaAssociada){
        Veiculo v1 = new Veiculo( modelo, ano, id, rotaAssociada);
        veiculos.add(v1);
        return v1;
    }

    public  void removeVeiculo(Integer indice){
        Veiculo veiculo = veiculos.get(indice);
        veiculos.remove(indice);
    }

    public  void listVeiculo(){
        for(int counter =0; counter <veiculos.size(); counter ++){
            Veiculo veiculo = veiculos.get(counter);
            System.out.println("Id: "+ veiculo.getId() + " Modelo: " + veiculo.getModelo() + " Ano: " + veiculo.getAno() + " Rota: " + veiculo.getRotaAssociada());
        }
    }

    public boolean verifica(Integer indice){
        try{
            veiculos.get(indice);
            return true;
        }catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public Veiculo encontra(Integer indice){
        return veiculos.get(indice);
    }

    public void editarId(Veiculo veiculo, Integer id){
        veiculo.setId(id);
    }

    public void editarModelo(Veiculo veiculo, String modelo){
        veiculo.setModelo(modelo);
    }

    public void editarAno(Veiculo veiculo, Integer ano){
        veiculo.setAno(ano);
    }

    public void editarRota(Veiculo veiculo, Integer rotaAssociada){
        veiculo.setRotaAssociada(rotaAssociada);
    }
}

