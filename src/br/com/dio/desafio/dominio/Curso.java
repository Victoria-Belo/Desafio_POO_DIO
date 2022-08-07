package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{	
	

	private int cargaHoraria;//boas práticas é criar variavéis como privados;
	
	public Curso() { //constructor 
	}
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria; //ao concluir curso, fazer esta regra de negócio
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
	
	
	
	
	
}
