package PackageHeranca;

public class Cachorro extends Animal {
    void latir() {
        System.out.println("Cachorro latindo...");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer(); // Método herdado de Animal
        cachorro.latir();
    }
}
