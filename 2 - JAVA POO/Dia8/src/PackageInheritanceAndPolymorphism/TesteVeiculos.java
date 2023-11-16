package PackageInheritanceAndPolymorphism;

public class TesteVeiculos {
    public static void main(String[] args) {
        // Criando instâncias de Carro e Moto
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();

        // Chamando o método acelerar() de Carro
        meuCarro.acelerar();

        // Chamando o método acelerar() de Moto
        minhaMoto.acelerar();
    }
}
