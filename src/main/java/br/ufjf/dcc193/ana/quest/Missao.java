package br.ufjf.dcc193.ana.quest;

import org.springframework.boot.autoconfigure.solr.SolrProperties;

public class Missao {

    private Cavaleiro cavaleiro;

    public Missao( Cavaleiro cavaleiro ) {
        System.out.println( "O rei criou uma nova missão" );
        setCavaleiro(cavaleiro);
    }

    public Missao(){
        this(null);
    }

    public void iniciar() {
        System.out.println( "A missão teve inicio" );
    }

    public void concluir() {
        this.cavaleiro.agir();
        System.out.println( "A missão checgou ao fim" );
    }

    public Cavaleiro getCavaleiro() {
        return cavaleiro;
    }

    public void setCavaleiro(Cavaleiro cavaleiro) {
        this.cavaleiro = cavaleiro;
    }

    
}
