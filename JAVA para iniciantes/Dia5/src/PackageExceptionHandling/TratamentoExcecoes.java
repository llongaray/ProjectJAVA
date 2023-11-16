package PackageExceptionHandling;

import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura de um número inteiro
            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Você digitou: " + numero);
        } catch (NumberFormatException e) {
            // Tratamento para caso não seja um número inteiro
            System.out.println("Erro: Por favor, digite um número válido.");
        } finally {
            // Bloco opcional que sempre será executado
            System.out.println("Bloco finally - encerrando o programa.");
            scanner.close();
        }
    }
}
