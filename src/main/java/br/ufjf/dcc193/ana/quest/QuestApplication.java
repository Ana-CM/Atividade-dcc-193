package br.ufjf.dcc193.ana.quest;

import javax.print.event.PrintJobListener;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(QuestApplication.class, args);
		System.out.println("Hora da Aventura");
		Missao m1 = ctx.getBean(Missao.class);
		m1.iniciar();
		m1.concluir(); 
	}
}
