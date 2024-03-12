/*Crie um programa que leia 4 notas, armazenando em um
vetor e calcule a média aritmética.

Verifique a situação do aluno considerando:
- Média maior ou igual a 7: Aprovado.
- Média maior ou igual a 5: Recuperação.
- Média menor que 5: Reprovado.

Mostre as 4 notas informadas pelo usuário e informe a média. */

import java.util.Scanner;

public class TreinoAlg2 {
    public static void main(String[] args) {

        //Criando leitor para escanear:
        Scanner leitor = new Scanner(System.in);
        //Criando variável nota:
        double[] notas  = new double[4];

        //For para solicitar notas:
        for (int contador = 0; contador < 4; contador ++){
            System.out.println("\n Insira a " + (contador + 1) + " nota: ");
            notas[contador] = leitor.nextDouble();
        }

        double soma = 0;
        for(int contador = 0; contador < 4; contador ++){
            soma += notas[contador];
        }

        double media = 0;
        media = soma/ notas.length;

        System.out.println("\n Média: " +media);

        if ( media >= 7){
            System.out.println("\n Situação aprovado");
        }
        else if (media >= 5) {
            System.out.println("\nSituação: recuperação");
        }
        else if (media < 5) {
            System.out.println("\nSituação: Reprovado.");
        }
        for ( int contador = 0; contador < 4; contador++){
            System.out.println("\n" + (contador + 1) + "nota: ");
            System.out.println(notas[contador]);
        }

    }
}
