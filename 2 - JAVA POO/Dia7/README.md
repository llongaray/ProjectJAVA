##Dia 7: Construtores e Destrutores

#Introdução:
O sétimo dia do curso foca na utilização de construtores em Java, bem como no gerenciamento de memória e conceitos relacionados a destrutores. Construtores são métodos especiais utilizados para inicializar objetos, enquanto destrutores (ou finalizadores) são responsáveis pela liberação de recursos antes que um objeto seja removido da memória.

#Agenda:
#1. Revisão Rápida do Dia Anterior (15 minutos):

Recapitulação dos conceitos do Dia 6.
Resolução de dúvidas dos alunos.
#2. Utilização de Construtores (60 minutos):

Explicação do conceito de construtores em Java.
Demonstração de diferentes tipos de construtores: padrão, com parâmetros, etc.

```
public class Carro {
    String modelo;
    int ano;

    // Construtor padrão
    public Carro() {
        modelo = "Desconhecido";
        ano = 0;
    }

    // Construtor com parâmetros
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}
```
#3. Gerenciamento de Memória e Destrutores (60 minutos):

Discussão sobre o gerenciamento automático de memória em Java.
Explicação sobre a ausência de destrutores explícitos em Java devido à coleta de lixo (garbage collection).

```
public class ExemploFinalizador {
    @Override
    protected void finalize() throws Throwable {
        // Código do destrutor (finalizador)
        System.out.println("Objeto está sendo finalizado...");
    }
}
```
#4. Exemplos Práticos (45 minutos):

Implementação prática de construtores em diferentes cenários.
Discussão sobre o papel da coleta de lixo na liberação de recursos.
#5. Exercícios Práticos (45 minutos):

Distribuição de exercícios para praticar a criação e uso de construtores.
Discussão sobre como os objetos são gerenciados na memória.
#6. Discussão dos Exercícios (30 minutos):

Revisão e discussão dos exercícios.
Exploração de possíveis problemas relacionados ao gerenciamento de memória e maneiras de evitá-los.
#7. Encerramento (15 minutos):

Recapitulação dos conceitos do dia.
Anúncio dos temas a serem abordados no próximo dia.
Incentivo à prática contínua e sugestões de recursos adicionais.
Este plano de aula visa proporcionar uma compreensão aprofundada do uso de construtores em Java e discutir o gerenciamento de memória, mesmo que Java não tenha destrutores no sentido tradicional. O entendimento desses conceitos é crucial para o desenvolvimento eficiente e sem vazamentos de memória.