package atividade;

public class Porta {
	public Boolean aberta;
	public Double dimensaoX,dimensaoY,dimensaoZ;
	public cor corPorta;
	
	public Porta(Double dimensaoX,Double dimensaoY, Double dimensaoZ) {
		this.aberta = false;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
		this.corPorta = cor.BRANCA;
	}
	public String toString() {
		if(this.aberta)
			return "Porta aberta e da cor "+this.corPorta;
		
		else return "Porta fechada e da cor "+this.corPorta;
	}
	void aberta() {
		aberta = true;
	}
	
	void fechada() {
		aberta = false;
	}

	public Boolean estaAberta() {
		return aberta;
	}

}
