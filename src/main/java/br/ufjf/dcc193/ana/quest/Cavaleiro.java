package br.ufjf.dcc193.ana.quest;

import org.springframework.stereotype.Component;

@Component("cavaleiro")
public class Cavaleiro implements Heroi {

    public Cavaleiro() {
        System.out.println("Um novo cavaleiro chega ao rei...");
    }

    public void agir() {
        System.out.println("O cavaleiro luta!");
    }
}
