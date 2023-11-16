package PackageVariaveis;

public class EscopoVariaveis {
    // Variável global
    static int numeroGlobal = 10;

    public static void main(String[] args) {
        // Variável local no método main
        int numeroLocalMain = 5;

        // Chamada de função que utiliza variáveis globais e locais
        usarVariaveis();
    }

    // Função que utiliza variáveis globais e locais
    static void usarVariaveis() {
        // Variável local na função
        int numeroLocalFuncao = 7;

        // Uso de variáveis em diferentes escopos
        System.out.println("Variável global: " + numeroGlobal);
        System.out.println("Variável local na função: " + numeroLocalFuncao);
    }
}
