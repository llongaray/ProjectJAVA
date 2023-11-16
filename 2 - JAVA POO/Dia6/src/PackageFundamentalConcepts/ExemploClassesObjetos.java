package PackageFundamentalConcepts;

//Definição da classe Carro
class Carro {
 String marca;
 String modelo;
 int ano;

 // Método construtor
 public Carro(String marca, String modelo, int ano) {
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
 }

 // Método para exibir informações do carro
 public void exibirInfo() {
     System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
 }
}

public class ExemploClassesObjetos {
 public static void main(String[] args) {
     // Instanciando objetos da classe Carro
     Carro carro1 = new Carro("Toyota -", "Corolla", 2022);
     Carro carro2 = new Carro("Honda  -", "Civic", 2021);

     // Chamando métodos da classe Carro
     carro1.exibirInfo();
     carro2.exibirInfo();
 }
}
