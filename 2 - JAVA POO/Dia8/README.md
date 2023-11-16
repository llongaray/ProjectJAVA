
#Dia 8: Herança e Polimorfismo

##Introdução:
No oitavo dia do curso, iremos aprofundar ainda mais os conceitos de herança e introduzir a implementação prática do polimorfismo em Java. Herança permite a criação de hierarquias de classes, enquanto o polimorfismo permite que objetos de classes diferentes sejam tratados de maneira uniforme.

##Agenda:
#1. Revisão Rápida do Dia Anterior (15 minutos):

Recapitulação dos conceitos do Dia 7.
Resolução de dúvidas dos alunos.
#2. Aprofundamento em Herança (60 minutos):

Revisão dos conceitos de herança.
Discussão sobre classes abstratas e métodos abstratos.
Implementação prática de hierarquias de classes.

```
// Classe abstrata
abstract class Veiculo {
    String marca;
    abstract void acelerar(); // Método abstrato
}

// Classe que estende Veiculo
class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Carro acelerando...");
    }
}

// Classe que estende Veiculo
class Moto extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Moto acelerando...");
    }
}
```
#3. Implementação de Polimorfismo (60 minutos):

Explicação do conceito de polimorfismo.
Demonstração de polimorfismo com base em herança.

```
public class PolimorfismoExemplo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        veiculo1.acelerar(); // Chama o método acelerar() de Carro
        veiculo2.acelerar(); // Chama o método acelerar() de Moto
    }
}
```
#4. Exemplos Práticos (45 minutos):

Implementação prática de hierarquias de classes com herança.
Demonstração de como o polimorfismo simplifica o código.
#5. Exercícios Práticos (45 minutos):

Distribuição de exercícios para praticar herança e polimorfismo.
Discussão sobre situações em que esses conceitos podem ser aplicados de forma eficaz.
#6. Discussão dos Exercícios (30 minutos):

Revisão e discussão dos exercícios.
Exploração de situações do mundo real em que herança e polimorfismo são vantajosos.
#7. Encerramento (15 minutos):

Recapitulação dos conceitos do dia.
Anúncio dos temas a serem abordados no próximo dia.
Incentivo à prática contínua e sugestões de recursos adicionais.
Este plano de aula visa proporcionar uma compreensão aprofundada e prática de herança e polimorfismo em Java. A implementação desses conceitos é fundamental para a construção de sistemas robustos e flexíveis.