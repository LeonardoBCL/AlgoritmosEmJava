

import java.util.Scanner;

class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }


    public void exibir_arma() {
        System.out.println("\n Arma: " + nome + ", Dano: " + dano);
    }

    public void atualizar_dano(int novoDano) {
        this.dano = novoDano;
        System.out.println("\n Dano aumentado para: + " + novoDano);

    }
    public int getDano(){
        return dano;
    }

}

class Personagem {
private String nome;
private int nivel;
private Arma arma_equipada;

public Personagem(String nome, int nivel, Arma arma_equipada ){
    this.nome = nome;
    this.nivel = nivel;
    this.arma_equipada = arma_equipada;
}

public void exibir_status(){
    System.out.println("\n Nome: " +nome);
    System.out.println("\n Nível: " +nivel);
}

public void subir_nivel(){
    this.nivel ++;
    System.out.println(nome + ", você subiu para o nível: " +nivel + " !");
    //Aumenta o dano da arma ao subir o nível:
    arma_equipada.atualizar_dano(arma_equipada.getDano() + 5);
    }

}


public class Sistema_up {
public static void main(String[] args) {
//Criando a arma:
    Arma lanca = new Arma("Lança-Lendária", 20);

    //Criando o personagem:
    Personagem jogador = new Personagem("Avatar", 1, lanca);

    //Exibindo status inicial:
    System.out.println("Status inicial do personagem: ");

    //Simulando subida de nível do personagem:
    jogador.subir_nivel();
    System.out.println("\n Status após subir de nível: ");
    jogador.exibir_status();

}
}
