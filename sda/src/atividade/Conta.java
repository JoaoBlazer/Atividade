package atividade;

public class Conta {
	public String nome, agencia;
	public Data datadeabertura;
	public Integer numero;
	public Double saldo;
	
	public Conta(String nome, String agencia,Data datadeabertura, Integer numero, Double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.datadeabertura = datadeabertura;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Boolean saca(Double valor) {
		if(valor < 0) {
			System.out.println("valor não pode ser sacado");
		    return false;
		}
		if(valor > this.saldo)
			return false;
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void deposita(Double valor) {
		if(valor < 0) {
			System.out.println("Tentador bular o sistema???");
		}
		this.saldo += valor; 
	}
	
	public Double redimento() {
		return saldo *0.1;
	}
	
	public Boolean impressao() {
		System.out.println("Numero: "+ numero);
		System.out.println("Nome: "+ nome);
		System.out.println("Data de criação: "+ datadeabertura.texto());
		System.out.println("Agencia: "+ agencia);
		System.out.println("Saldo: "+ saldo);
		return true;
	}

}
