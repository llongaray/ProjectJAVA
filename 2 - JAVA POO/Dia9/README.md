#Dia 9: Interfaces e Classes Abstratas

##Introdução:
No nono dia do curso, vamos explorar o uso de interfaces e classes abstratas em Java. Interfaces proporcionam uma forma de especificar comportamentos sem a necessidade de implementação, enquanto classes abstratas permitem a criação de classes que podem conter métodos abstratos e métodos com implementações.

##Agenda:
#1. Revisão Rápida do Dia Anterior (15 minutos):

Recapitulação dos conceitos do Dia 8.
Resolução de dúvidas dos alunos.
#2. Compreensão de Interfaces (60 minutos):

Explicação do conceito de interfaces em Java.
Demonstração de como criar e implementar interfaces.

```
// Exemplo de interface
interface Animal {
    void fazerSom();
}

// Classe que implementa a interface
class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro fazendo som...");
    }
}
```
#3. Uso de Classes Abstratas (60 minutos):

Explicação sobre classes abstratas e métodos abstratos.
Demonstração de como criar e estender classes abstratas.

```
// Exemplo de classe abstrata
abstract class Forma {
    // Método abstrato
    abstract void desenhar();

    // Método com implementação
    void redimensionar() {
        System.out.println("Redimensionando a forma...");
    }
}

// Classe que estende a classe abstrata
class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo...");
    }
}
```
#4. Exemplos Práticos (45 minutos):

Implementação prática de interfaces e classes abstratas.
Discussão sobre situações em que esses conceitos são úteis.
#5. Exercícios Práticos (45 minutos):

Distribuição de exercícios para praticar o uso de interfaces e classes abstratas.
Exploração de casos em que cada conceito é mais apropriado.
#6. Discussão dos Exercícios (30 minutos):

Revisão e discussão dos exercícios.
Compartilhamento de soluções e abordagens dos alunos.
#7. Encerramento (15 minutos):

Recapitulação dos conceitos do dia.
Anúncio dos temas a serem abordados no próximo dia.
Incentivo à prática contínua e sugestões de recursos adicionais.
Este plano de aula visa proporcionar uma compreensão sólida de como usar interfaces e classes abstratas em Java. Ambos os conceitos são fundamentais para a criação de sistemas flexíveis e extensíveis.