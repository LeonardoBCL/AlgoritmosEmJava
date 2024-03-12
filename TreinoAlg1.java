
/*Crie um programa que leia 3 notas, armazenando em um
vetor e calcule a média aritmética.

Mostre as 3 notas informadas pelo usuário e informe a média.*/

import java.util.Scanner;

public class TreinoAlg1 {

    public static void main(String[] args) {

        //Criando Scanner:
        Scanner leitor = new Scanner(System.in);
        //Criando notas:
        double[] numero = new double[3];

        for ( int contador = 0; contador < 3; contador ++){
            System.out.println("Insira a " + (contador + 1) + " nota:");
        numero[contador] = leitor.nextDouble();
        }

        //Variável soma:
        double soma = 0;

        //For pra somar

        for (int contador = 0; contador < 3; contador++){
            soma += numero[contador];
        }
        //Criação da variável média e uso do length para ler a quantidade de números inseridos.
        double media = soma/numero.length;
        //For para exibir:
        for (int contador = 0; contador < 3; contador++){
            System.out.println("\n A " + (contador+1) + " nota é: ");
            System.out.println(numero[contador]);
        }

        System.out.println("\n \tMédia equivale a: " + media);

        //Fechar scanner
        leitor.close();

    }
}
