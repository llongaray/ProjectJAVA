package PackageColecoes;

import java.util.HashSet;
import java.util.Set;

public class SetsExemplo {
    public static void main(String[] args) {
        // Criando um conjunto de números inteiros
        Set<Integer> numeros = new HashSet<>();

        // Adicionando elementos ao conjunto
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(5); // Tentativa de adicionar um elemento duplicado (será ignorado)

        // Acessando e exibindo elementos do conjunto
        System.out.println("Número de elementos no conjunto: " + numeros.size());

        // Iterando sobre o conjunto
        System.out.println("Todos os números no conjunto:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
