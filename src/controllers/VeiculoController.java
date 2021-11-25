// package controllers;
// import models.Veiculo;

// /**
//  * VeiculoController
//  */
// public class VeiculoController {

//     public static Veiculo addVeiculo (String modelo, Integer ano, Integer id, String condicoes){
//         Veiculo v1 = new Veiculo( modelo, ano, id,  condicoes);
//         return v1;
//     }

//     public static void removeVeiculo(Integer indice, ArrayList<Veiculo> veiculos){
//         veiculos.remove(indice);
//     }

//     public static Veiculo modVeiculo (String modelo, Integer ano, Integer id, String condicoes){
//         return addVeiculo(modelo, ano, id, condicoes)
//     }

//     public static void listVeiculo(ArrayList<Veiculo> veiculos){
//         for(Veiculo veiculos : veiculo){
//             System.out.println("Id:"+ veiculo.id + "Modelo:" + veiculo.modelo + "Ano" + veiculo.ano + "Condições: " + veiculo.condicoes);
//         }
//     }
// }