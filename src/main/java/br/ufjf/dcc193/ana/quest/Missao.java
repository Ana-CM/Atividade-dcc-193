package br.ufjf.dcc193.ana.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.solr.SolrProperties;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Missao {

    @Autowired
    private Heroi heroi;

    public Missao( Heroi heroi) {
        System.out.println( "O rei criou uma nova missão" );
        setHeroi(heroi);
    }

    public Missao(){
        this(null);
    }

    public void iniciar() {
        System.out.println( "A missão teve inicio" );
    }

    public void concluir() {
        this.heroi.agir();
        System.out.println( "A missão checgou ao fim" );
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi Heroi) {
        this.heroi = Heroi;
    }

    
}
