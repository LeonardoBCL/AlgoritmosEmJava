package atvddpt;

public class Produto {
	
	public double preco;
	public int quantidade;
	public String nome;
	
	
	public void Nomeiaproduto(String nome) {
		
		this.nome = nome;
		
	}
	
	
	
	public void Addproduto (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void Subtraiproduto(int estoque) {
		this.quantidade -= estoque;
		
	}
	
	
	
	
	

}
