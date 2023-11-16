package ControleFluxo;
import java.util.Scanner;

public class ControleFluxoExemplos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Exemplo de Estruturas de Decisão
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número é positivo.");
        } else if (numero < 0) {
            System.out.println("Número é negativo.");
        } else {
            System.out.println("Número é zero.");
        }

        // Exemplo de Estruturas de Repetição
        System.out.print("Digite um limite para contagem: ");
        int limite = scanner.nextInt();

        // Usando for para contar até o limite
        System.out.println("Contagem usando for:");
        for (int i = 1; i <= limite; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  // Pular uma linha após a contagem com for

        // Usando while para contar até o limite
        System.out.println("Contagem usando while:");
        int contador = 1;
        while (contador <= limite) {
            System.out.print(contador + " ");
            contador++;
        }
        System.out.println();  // Pular uma linha após a contagem com while

        // Usando do-while para contar até o limite
        System.out.println("Contagem usando do-while:");
        int cont = 1;
        do {
            System.out.print(cont + " ");
            cont++;
        } while (cont <= limite);
        System.out.println();  // Pular uma linha após a contagem com do-while

        scanner.close();
	}

}
