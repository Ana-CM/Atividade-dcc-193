package br.ufjf.dcc193.ana.quest;

import javax.print.event.PrintJobListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrProperties;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);
		System.out.println("Hora da Aventura");

		Heroi c1 = Guilda.criaHeroi();
		Missao m1 = new Missao();
		m1.setHeroi( c1 );
		m1.iniciar();
		m1.concluir(); 
	}
}
