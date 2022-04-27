package br.ufjf.dcc193.ana.quest;

import org.springframework.stereotype.Component;

@Component("clerigo")
public class Clerigo implements Heroi {

    public Clerigo() {
        System.out.println("Um novo clérigo chega ao rei...");
    }

    public void agir() {
        System.out.println("O clérigo luta!");
    }
}
