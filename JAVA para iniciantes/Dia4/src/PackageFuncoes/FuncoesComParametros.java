package PackageFuncoes;

public class FuncoesComParametros {
    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("A soma é: " + resultado);
    }

    // Função com parâmetros e retorno
    static int somar(int a, int b) {
        return a + b;
    }
}
