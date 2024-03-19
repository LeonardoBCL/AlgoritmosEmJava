import java.sql.SQLOutput;
import java.util.Scanner;

//A antiga criação de struct. Agora, fica FORA do main.
//É criado uma classe nova para chamar a mesma depois.
class Alunos {
    String nome;
    int idade;

    //Inicializando OBEJTO Alunos
    Alunos(String nome, int idade){
        //O this, puxa as variáveis das linhas 6 e 8.
        this.nome = nome;
        this.idade = idade;
        //A igualdade atribui o valor das linhas 6 e 8, as variáveis criadas dentro do objeto Alunos
        // inicializado.

    }

    //Um metodo criado para retornar valores.
    void exibirdados(){
        System.out.println("\n Nome: " +nome);
        System.out.println("\n Idade: " +idade);
    }

}

public class Treinostructs {

    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        //Solicita nome do aluno:
        System.out.println("\n Por favor, insira o nome do aluno: ");
        String nome = scam.nextLine();

        System.out.println("\n Por favor, insira a idade do aluno: ");
        int idade = scam.nextInt();

        // Cria um objeto Aluno com os dados fornecidos.

        Alunos dados_fornecidos = new Alunos(nome,idade);

        //Exibe:
        System.out.println("\n Dados do aluno: ");

        dados_fornecidos.exibirdados();

        scam.close();

    }

}
    /*  Neste exemplo, a classe Aluno tem dois atributos (nome e idade),
        um construtor para inicializar esses atributos e
        um método exibirDados() para mostrar as informações do aluno.
        No método main, são solicitados o nome e a idade do aluno ao usuário,
        um objeto Aluno é criado com esses dados e,
        em seguida, os dados são exibidos na saída padrão.   */