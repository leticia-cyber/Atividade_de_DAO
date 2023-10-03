import java.util.Scanner;

public class Perguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- O que são padrões de projeto?");
            System.out.println("2- Quais os principais pontos que devem ser tratados ao se ensinar/aprender sobre um padrão de projeto?");
            System.out.println("3- Quais as vantagens do DAO?");
            System.out.println("4- Quais as desvantagens do DAO?");
            System.out.println("5- Qual a relação do JDBC e DAO? É realmente necessário usar JDBC?");
            System.out.println("0- Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Padrões de projeto, também conhecidos como *design patterns* em inglês, são soluções para problemas comuns de design de software.\nEles são descrições de abordagens que podem ser usadas para resolver problemas recorrentes no desenvolvimento de software. Padrões de projeto fornecem um conjunto de diretrizes, melhores práticas e estruturas para resolver problemas específicos de forma eficiente e eficaz.\nOs padrões de projeto são geralmente categorizados em três grupos principais:\n\n1. **Padrões de Criação**: Esses padrões se concentram na criação de objetos e como organizar as relações entre eles. Exemplos incluem o Singleton, Factory Method e Abstract Factory.\n2. **Padrões de Estrutura**: Esses padrões lidam com a composição de classes ou objetos para formar estruturas maiores. Exemplos incluem o Adapter, Decorator e Composite.\n3. **Padrões de Comportamento**: Esses padrões se concentram nas interações entre objetos e como eles se comunicam entre si. Exemplos incluem o Observer, Strategy e Command.");
                    break;
                case 2:
                    System.out.println("Ao ensinar ou aprender sobre um padrão de projeto, é importante abordar os seguintes pontos:\n\n1. **Problema**: Identificar claramente o problema que o padrão se destina a resolver.\n2. **Solução**: Explicar como o padrão resolve o problema, incluindo sua estrutura e funcionamento.\n3. **Contexto de Uso**: Indicar em que situações é apropriado aplicar o padrão.\n4. **Participantes**: Descrever as classes e objetos envolvidos no padrão e seus papéis.\n5. **Colaborações**: Mostrar como esses participantes interagem entre si.\n6. **Consequências**: Discutir as vantagens e desvantagens de aplicar o padrão.\n7. **Exemplos**: Fornecer exemplos concretos de implementação do padrão em uma linguagem de programação específica.\n8. **Comparação**: Comparar o padrão com outros padrões relacionados ou alternativas de design.");
                    break;
                case 3:
                    System.out.println("O padrão DAO (Data Access Object) é usado para isolar a camada de acesso a dados em um sistema de software. Suas vantagens incluem:\n\n1. **Separação de Responsabilidades**: O DAO separa a lógica de acesso a dados da lógica de negócios, promovendo uma arquitetura mais organizada e coesa.\n2. **Reutilização de Código**: Os métodos do DAO podem ser reutilizados em várias partes do aplicativo, evitando duplicação de código.\n3. **Manutenção Facilitada**: Qualquer alteração na camada de acesso a dados pode ser feita em um único local (a implementação do DAO), simplificando a manutenção.\n4. **Flexibilidade de Acesso a Dados**: O DAO permite que você altere facilmente o mecanismo de armazenamento (por exemplo, mudar de um banco de dados relacional para um banco de dados NoSQL) sem afetar a lógica de negócios.\n5. **Testabilidade**: O isolamento da camada de acesso a dados torna os testes unitários mais fáceis de serem realizados, já que é possível criar mock objects para simular o acesso a dados.");
                    break;
                case 4:
                    System.out.println("Embora o DAO ofereça muitas vantagens, também apresenta algumas desvantagens, incluindo:\n\n1. **Complexidade Adicional**: A introdução de uma camada DAO pode adicionar complexidade ao projeto, especialmente em aplicativos pequenos e simples.\n2. **Potencial para Código Repetitivo**: Se não for implementado corretamente, o padrão DAO pode levar à criação de muitos métodos semelhantes para diferentes entidades.\n3. **Overhead de Desenvolvimento**: O desenvolvimento de uma camada DAO pode exigir esforço adicional no início do projeto.\n4. **Possível Sobrecarga de Desempenho**: Em alguns casos, a camada DAO pode introduzir alguma sobrecarga de desempenho devido à necessidade de traduzir entre objetos de domínio e estruturas de dados");
                    break;
                case 5:
                    System.out.println("O JDBC (Java Database Connectivity) é uma API em Java que permite a conexão a bancos de dados relacionais. O DAO é um padrão de projeto que separa a lógica de acesso a dados do restante do código. A relação entre o JDBC e o DAO é que o JDBC é frequentemente usado na implementação da camada DAO quando se trabalha com bancos de dados relacionais em aplicativos Java.\nNo entanto, não é estritamente necessário usar o JDBC com o padrão DAO. Se você estiver trabalhando com outros tipos de armazenamento de dados, como sistemas de arquivos, serviços web ou bancos de dados NoSQL, a implementação do DAO pode ser adaptada para atender a essas necessidades específicas.\nPortanto, a escolha de usar o JDBC ou outra tecnologia depende do tipo de sistema de armazenamento de dados que você está usando e das necessidades do seu aplicativo.\nEm muitos casos, o JDBC é a escolha tradicional para bancos de dados relacionais em aplicativos Java, mas há alternativas, como JPA (Java Persistence API), Hibernate e outras bibliotecas de persistência, que podem ser usadas em conjunto com o padrão DAO.");
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}
