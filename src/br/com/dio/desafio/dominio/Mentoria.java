package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	
	private LocalDate data; //classe para trabalhar com datas
	
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}//métodos abstratos devem ser implementado nas classes-filhas, tal como este caso
	

	public Mentoria() { //constructor
		
	}	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() { //boas práticas: poder imprimir tudo;
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	} //esses gets dentro do ToString é pq estamos chamando os métodos de Conteudo
	
	
	
}
