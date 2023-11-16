package PackageUnderstandingInterfaces;

public class Main {
    public static void main(String[] args) {
        // Exemplo com a interface Animal e a classe Cachorro
        Animal animal = new Cachorro();
        animal.fazerSom();

        // Exemplo com a classe abstrata Forma e a classe Circulo
        Forma forma = new Circulo();
        forma.desenhar();
        forma.redimensionar();
    }
}
