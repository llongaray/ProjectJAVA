package PackageArray;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // Declaração e inicialização de um array bidimensional (matriz)
        Object[][] matriz = new Object[2][6];

        // Atribuindo valores à matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5; // Corrigido o índice
        matriz[0][5] = 6;
        matriz[1][0] = 'A'; // Novos valores para a segunda linha
        matriz[1][1] = 'B';
        matriz[1][2] = 'C';
        matriz[1][3] = 'D';
        matriz[1][4] = 'E';
        matriz[1][5] = 'F';

        // Acessando e exibindo elementos da matriz
        System.out.println("Elemento na posição (1, 1): " + matriz[0][0]);

        // Iterando sobre a matriz
        System.out.println("Todos os elementos da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
