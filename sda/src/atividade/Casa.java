package atividade;

public class Casa {
    public cor corPorta;
	public Porta porta1, porta2, porta3;
	public Pessoa proprietario;

	public Casa( Porta porta1, Porta porta2, Porta porta3, Pessoa proprietario) {
		this.corPorta = cor.BRANCA;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
		this.proprietario = proprietario;
	}
	
	public String toString() {
		return "Casa : proprietario ,"+proprietario+"corDaCasa"+corPorta+"porta1"+porta1+"porta2"+porta2+"porta3"+porta3;
	}
		
	public void pinta(cor novaCor) {
			this.corPorta = novaCor;
	}
	
	int qtdPortasEstaoAbertas() {
			int cont = 0;
			if (porta1.estaAberta()) cont++;
			return cont;
	}
		
	public void alteraProprietario(Pessoa novoProprietario) {
			proprietario = novoProprietario;
	}

}
