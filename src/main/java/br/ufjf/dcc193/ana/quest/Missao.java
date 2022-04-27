package br.ufjf.dcc193.ana.quest;

import org.springframework.boot.autoconfigure.solr.SolrProperties;

public class Missao {

    private Cavaleiro cavaleiro;

    public Missao() {
        System.out.println( "O rei criou uma nova missão" );
        this.cavaleiro = new Cavaleiro();
    }

    public void iniciar() {
        System.out.println( "A missão teve inicio" );
    }

    public void concluir() {
        cavaleiro.agir();
        System.out.println( "A missão checgou ao fim" );
    }
}
