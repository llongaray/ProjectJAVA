package PackageColecoes;

import java.util.ArrayList;
import java.util.List;

public class ListasExemplo {
    public static void main(String[] args) {
        // Criando uma lista de Strings
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos à lista
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Charlie");

        // Acessando e exibindo elementos da lista
        System.out.println("Primeiro nome na lista: " + nomes.get(0));

        // Iterando sobre a lista
        System.out.println("Todos os nomes na lista:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
