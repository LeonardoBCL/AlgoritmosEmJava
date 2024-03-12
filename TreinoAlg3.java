/*Crie um algoritmo que leia o nome e a idade
de 5 pessoas, armazenando em vetores.

- Liste o nome e a idade de cada pessoa.*/

import java.util.Scanner;

public class TreinoAlg3 {
    public static void main(String[] args) {
        //Criando leitura:
        Scanner leitor = new Scanner(System.in);
        //Var:
        String[] nomes = new String[5];
        int[] idades = new int [5];

        //Solicitando
        for(int contador = 0; contador < 5; contador ++){
            System.out.println("Insira o " + (contador + 1) + " nome: ");
            nomes[contador] = leitor.nextLine();

            System.out.println("Insira a " + (contador + 1) + " idade: ");
            idades[contador] = leitor.nextInt();

            //Limpa o Buffer ( importante com STR ) //Equivale ao antigo fflush (stdin);
            leitor.nextLine();
        }



        //Exibindo

        for( int contador = 0; contador < 5; contador++){
            System.out.println((contador + 1) + " nome: " +nomes[contador]);
            System.out.println((contador + 1) + " idade: " +idades[contador]);
        }



        leitor.close();

    }
}
