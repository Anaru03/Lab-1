/**
Así como en la clase de Perro, en la clase de Persona el programa elegirá un número aleatorio gracias al
 objeto que se creo como nuevo llamado random.
 Se usarán los atributos llamados: confiabilidad y galletas y según el número aleatorio que salga en el programa,
 el perro actuará y la clase Persona reaacionará al acto, ya sea renunciando, asustandose o acariciandolo
 **/

package model;

import java.util.Random;

public class Persona {
    private int confiabilidad;
    private boolean galleta;

    public Persona(){
        Random r = new Random();
        int aleatoreo = r.nextInt(10);
        confiabilidad = aleatoreo;
        int aleatoreo2 = r.nextInt(1);
        if (aleatoreo2 == 0){
            galleta = false;
        }
        if(aleatoreo2 == 1) {
            galleta = true;
        }
    }

    public void renunciar(){
        System.out.println("EL perro ha mordido a la persona, la persona renuncia");
    }
    public void asustarse(){
        System.out.println("El Perro ha ladrado a la persona, esta esta asustada pero le da una galleta.");
    }
    public void acariciar(){
        System.out.println("Persona acaricia al perro");
    }

    public int getConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(int confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public boolean isGalleta() {
        return galleta;
    }

    public void setGalleta(boolean galleta) {
        this.galleta = galleta;
    }
}
