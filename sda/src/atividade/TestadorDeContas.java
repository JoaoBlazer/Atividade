package atividade;

public class TestadorDeContas {
	
	public static void main(String[] args) {
		Data  d1 = new Data( 12, 11, 2004);
		 
		Conta c1 = new Conta("João", "Nubank",  d1 , 123, 100.0);
		System.out.println(c1.impressao());
		
		System.out.println("\n");
		
		// Primeiro metodo de comparação
		Conta c2 = new Conta(null, null, null, null, null);
		c2.nome = "Danilo";
		c2.saldo = 100.0;
		
		Conta c3 = new Conta(null, null, null, null, null);
		c3.nome = "Danilo";
		c3.saldo = 100.0;
		
		if(c2 == c3) {
			System.out.println("iguais\n");
		}
		else {
			System.out.println("diferentes\n");
		}
		
		System.out.println("Proxima questão\n");
		//Segundo metodo de comparação
		Conta c4 = new Conta(null, null, null, null, null);
		c4.nome = "Juliana";
		c4.saldo = 200.0;
		Conta c5 = new Conta(null, null, null, null, null);
		c4 = c5;
		if(c4 == c5) {
			System.out.println("iguais\n");
		}
		else {
			System.out.println("diferentes\n");
		}
		
	}

}
