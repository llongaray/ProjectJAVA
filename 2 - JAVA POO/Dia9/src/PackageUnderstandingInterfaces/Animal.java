package PackageUnderstandingInterfaces;

// Exemplo de interface
public interface Animal {
    void fazerSom();
}

// Classe que implementa a interface
class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro fazendo som...");
    }
}
