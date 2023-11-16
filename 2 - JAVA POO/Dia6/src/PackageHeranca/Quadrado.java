package PackageHeranca;

public class Quadrado implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }

    public static void main(String[] args) {
        Forma quadrado = new Quadrado();
        quadrado.desenhar();
    }
}
