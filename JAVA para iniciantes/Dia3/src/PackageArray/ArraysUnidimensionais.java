package PackageArray;

public class ArraysUnidimensionais {

	public static void main(String[] args) {
		// Declaração e inicialização de um array unidimensional de inteiros
        int[] numeros = new int[5];

        // Atribuindo valores ao array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e exibindo elementos do array
        System.out.println("Elemento na posição 2: " + numeros[1]);

        // Iterando sobre o array
        System.out.println("Todos os elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
	}
}
