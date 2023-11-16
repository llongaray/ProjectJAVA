package PackageHeranca;

public class Circulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }

    public static void main(String[] args) {
        Forma circulo = new Circulo();
        circulo.desenhar();
    }
}
