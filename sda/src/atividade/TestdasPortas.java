package atividade;

import java.util.Scanner;

public class TestdasPortas {
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("infome o nome da pessoa:\n");
		String nome = sc.next();
		
		System.out.println("infome a idade da pessoa:\n");
		Integer idade = sc.nextInt();
		
    
		Pessoa p = new Pessoa (nome, idade);
		p.FazAniversario();
		System.out.println(p);
		
		Porta porta1 = new Porta(70.0, 2.0, 0.01);
		porta1.corPorta = cor.BRANCA;
		
		Porta porta2 = new Porta(70.0, 2.0, 0.01);
		porta2.corPorta = cor.AZUL;
		
		Porta porta3 = new Porta(70.0, 2.0, 0.01);
		porta3.corPorta = cor.PRETA;
		
		Casa c = new Casa( porta1, porta2, porta3, p);
		System.out.println("Cor da casa: " + c.corPorta);
		
		c.pinta(cor.AZUL);
		
		System.out.println("Nova cor da casa: "+c.corPorta);
		
		c.porta1.aberta();
		
		System.out.println("Portas abertas " + c.qtdPortasEstaoAbertas());
		
		Pessoa novoProprietario = new Pessoa("Ricardo" ,26);
		c.alteraProprietario(novoProprietario);
		System.out.println("Novo proprietario da casa: " + c.proprietario.nome);
		
		
	}

}
