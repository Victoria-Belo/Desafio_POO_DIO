package br.com.dio.desafio.dominio;
//todo bootcamp tem conteúdo e Mentoria e Cursos são conteúdos
public abstract class Conteudo {//Classe abstrata não vai instanciar conteúdo, mas permitir que usem de suas variáveis. 
	
	protected static final double XP_PADRAO = 10d; //variável CONSTANTE que vai atribuir valor 10 a todo conteúdo. Final(pal. reserv p/ constante)
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
