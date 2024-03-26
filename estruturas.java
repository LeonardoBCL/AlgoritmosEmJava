//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
class Caneta {
    int numeracao;
    String cor;
}

public class estruturas{
    public static void main(String[] args) {
   Scanner scanf = new Scanner (System.in);

   //Criação de INSTÂNCIA:
        Caneta caneta = new Caneta();

   //Solicita e refere-se ao dado:
        System.out.println("\n Insira a numeraçãop de fabricação: ");
        caneta.numeracao = scanf.nextInt();
   //Cor:
        System.out.println("\n Insira a cor da caneta: ");
        caneta.cor = scanf.nextLine();
        //LIMPA O BUffer ( STDIN )
        scanf.nextLine();

        //Fechamento do SCAM
        scanf.close();
    }
}