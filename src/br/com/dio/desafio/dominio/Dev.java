package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo>conteudoInscritos = new LinkedHashSet<>(); //salvos na ordem natural;
	private Set<Conteudo>conteudoConcluidos = new LinkedHashSet<>();
	//por que não ARRAYLIST? Porque cursos e mentorias não são coisas únicas;
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());//todo conteudo dentro dos conteudos insc.
		bootcamp.getDevsInscritos().add(this);//adicionando conteudos insc. para devs matriculados no curso
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
	
	public double calcularTotalXP() {
		return this.conteudoConcluidos
				.stream() 
				.mapToDouble(conteudo -> conteudo.calcularXP()) //cada conteudo completado
				.sum(); //somar
						
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	@Override
	public int hashCode() {  //esse metodo ocorre quando trabalhamos com HashLists
		return Objects.hash(conteudoConcluidos, conteudoInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}
	
	

	

}
