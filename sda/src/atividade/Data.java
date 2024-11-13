package atividade;

public class Data {
	
	public Integer dia;
	public Integer mes;
	public Integer ano;
	
	public Data(Integer dia,Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String texto() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}

}
