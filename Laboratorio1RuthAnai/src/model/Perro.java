/**
 En la clase de perro se encuentran los atributos de animo y umbral, los cuales estan con valores aleatorios.
 Por lo que dependiendo del valor que asigne el programa aleatoriamente, el perro actuará,
 ya sea mordiendo, ladrando o moviéndose. Eso dependera del rango y umbral el cual el perro se encuentre.
 **/



package model;

import java.util.Random;
public class Perro {
    private int animo;
    private int umbral;

    public Perro(){
        Random r = new Random();
        animo =  r.nextInt(9)-5;
        umbral =  r.nextInt(20) *-1;
    }

    public void morder(){
        System.out.println("MUERDE");
    }
    public void ladrar(){
        System.out.println("LADRAR");
    }

    public void mover(){
        System.out.println("El perro mueve la cola");
    }
    public int getAnimo() {
        return animo;
    }

    public void setAnimo(int animo) {
        this.animo = animo;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }
}
