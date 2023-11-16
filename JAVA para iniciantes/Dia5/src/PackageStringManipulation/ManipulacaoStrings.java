package PackageStringManipulation;

public class ManipulacaoStrings {
    public static void main(String[] args) {
        // Exemplos de operações com strings
        String texto = "Java é uma linguagem de programação.";

        // Tamanho da string
        int tamanho = texto.length();
        System.out.println("Tamanho da string: " + tamanho);

        // Concatenação de strings
        String outraString = " Muito poderosa!";
        String concatenada = texto.concat(outraString);
        System.out.println("Strings concatenadas: " + concatenada);

        // Substring
        String parte = texto.substring(0, 4);
        System.out.println("Substring: " + parte);

        // Busca na string
        boolean contem = texto.contains("linguagem");
        System.out.println("Contém a palavra 'linguagem': " + contem);
    }
}
