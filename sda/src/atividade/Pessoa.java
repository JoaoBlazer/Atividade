package atividade;

public class Pessoa {
	public String nome;
	public Integer idade; 
	public Pessoa(String nome,Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void FazAniversario() {
		this.idade += 1;
	}
	
	public String toString(){
		return "O seu nome é "+ this.nome +" e sua idade hoje é pq ta fazendo aniversario "+this.idade;
	}

}
