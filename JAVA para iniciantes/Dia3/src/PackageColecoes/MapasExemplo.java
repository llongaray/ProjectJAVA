package PackageColecoes;

import java.util.HashMap;
import java.util.Map;

public class MapasExemplo {
    public static void main(String[] args) {
        // Criando um mapa de String para Integer
        Map<String, Integer> idadePorNome = new HashMap<>();

        // Adicionando elementos ao mapa
        idadePorNome.put("Alice", 25);
        idadePorNome.put("Bob", 30);
        idadePorNome.put("Charlie", 28);

        // Acessando e exibindo elementos do mapa
        System.out.println("Idade de Alice: " + idadePorNome.get("Alice"));

        // Iterando sobre as chaves do mapa
        System.out.println("Nomes no mapa:");
        for (String nome : idadePorNome.keySet()) {
            System.out.println(nome);
        }

        // Iterando sobre os valores do mapa
        System.out.println("Idades no mapa:");
        for (Integer idade : idadePorNome.values()) {
            System.out.println(idade);
        }

        // Iterando sobre pares chave-valor do mapa
        System.out.println("Nomes e idades no mapa:");
        for (Map.Entry<String, Integer> entry : idadePorNome.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }
    }
}
