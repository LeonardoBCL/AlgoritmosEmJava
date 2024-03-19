//Bibliotecas:
import java.util.Scanner;
public class TreinoAlg5 {
    public static void main(String[] args) {

        //Criando Scam:
        Scanner scam = new Scanner(System.in);

        int tempo_tb = 0;

        System.out.println("\n Sistema de aprovação.");
        System.out.println("\n Por favor, insira a sua idade: ");
        int idade = scam.nextInt();

        System.out.println("\n Por favor, insira o seu tempo de trabalho: ");
        tempo_tb = scam.nextInt();

        System.out.println("\n Insira o código de empregado: ");
        int numero_empregado = scam.nextInt();

        System.out.println("\n Informe seu ano de nascimento: ");
        int ano_nascimento = scam.nextInt();


        //Escrevendo código, idade e tempo trabalhado:
        System.out.println("\n Código: " + numero_empregado);
        System.out.println("\n Idade: " + idade);
        System.out.println("\n Tempo trabalhado: " + tempo_tb);

        //Condicional:
        if (idade >= 65 || tempo_tb > 30) {
            System.out.println("\n Requerer aposentadoria.");
        } else {
            System.out.println("\n Não requerer aposentadoria.");
        }

    }

}
