package PackageUnderstandingInterfaces;

// Exemplo de classe abstrata
public abstract class Forma {
    // Método abstrato
    abstract void desenhar();

    // Método com implementação
    void redimensionar() {
        System.out.println("Redimensionando a forma...");
    }
}

// Classe que estende a classe abstrata
class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo...");
    }
}
