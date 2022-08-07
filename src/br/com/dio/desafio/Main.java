package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		//*****INSTANCIANDO CURSOS*****//
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descrição curso javascript");
		curso2.setCargaHoraria(4);
		
		//*********INSTANCIANDO MENTORIA*********//		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de Java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now()); //auto-created
		
		//***********exemplo de POLIMORFISMO***********//		
		 //Conteudo conteudo = new Curso();
		 //Conteudo conteudo1 = new Mentoria();
		//*************************//
				
		System.out.println(curso1);
		System.out.println(mentoria1);
		//*****************************//
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("descrião bootcamp JD");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devVick = new Dev();
		devVick.setNome("Victória");
		devVick.inscreverBootcamp(bootcamp);
		devVick.progredir();
		Dev devHoruru = new Dev();
		devHoruru.setNome("Hórus");
		
		System.out.println("Conteúdos Inscritos: " + devVick.getConteudoInscritos());
		System.out.println("Conteúdos concluídos: " + devVick.getConteudoConcluidos());
		System.out.println("XP:" + devVick.calcularTotalXP());
		

	}//fim-static-void main
}//fim-class
