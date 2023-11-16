package PackageInheritanceAndPolymorphism;

// Classe abstrata
abstract class Veiculo {
    protected String marca; // Modificador 'protected' para permitir acesso em subclasses
    abstract void acelerar(); // Método abstrato
}

// Classe que estende Veiculo
class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Carro acelerando...");
    }
}

// Classe que estende Veiculo
class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Moto acelerando...");
    }
}
