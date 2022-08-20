/**
Universidad del Valle de Guatemala
 Ruth Anaí de León Morataya - Carné: 22428
 Lab #1 clases - Perrera
 19 de agosto del 2022
 **/

package ui;
import model.Perro;
import model.Persona;
import java.util.Random;
import java.util.Scanner;

public class DriveProgram {
    static int op = 0;
    public static void main(String args[]){

        Perro perro;
        Persona persona;

        do{
            menu();
        }while (op != 5);
    }
    public static Persona nuevaPersona(){
        Persona persona = new Persona();
        mostrarEstadoPersona(persona);
        return persona;
    }
    public static Perro nuevoPerro(){
        Perro perro = new Perro();
        mostratEstadoPerro(perro);
        return perro;
    }
    public static int sacarGalleta(Persona persona){
        int suma = 0;
        if(persona.isGalleta()){
            suma = 5;
            persona.setGalleta(false);
        }
        else{
            System.out.println("la persona no tiene galleta.");
        }
        return suma;
    }
    public static void interactuar(Perro perro, Persona persona){
        mostratEstadoPerro(perro);
        mostrarEstadoPersona(persona);
        if (perro.getAnimo()< perro.getUmbral()){
            perro.morder();
            persona.renunciar();
        }
        if( (perro.getAnimo()<0) && (perro.getAnimo()> perro.getUmbral() ) ){
            perro.ladrar();
            persona.asustarse();
            if(persona.isGalleta()){
                perro.setAnimo(perro.getAnimo() + sacarGalleta(persona));
                mostratEstadoPerro(perro);
            }
            else{
                System.out.println("La persona no tiene galletas para dar");
            }
        }
        if(perro.getAnimo()>0){
            perro.mover();
            persona.acariciar();
        }
    }
    public static void mostratEstadoPerro(Perro perro){
        System.out.println("Estado Perro:");
        System.out.println("Animo: " + perro.getAnimo());
        System.out.println("Umbral: "+ perro.getUmbral());
    }
    public static void mostrarEstadoPersona(Persona persona){
        System.out.println("Estado Persona: ");
        System.out.println("Confiabilidad: " + persona.getConfiabilidad());
        System.out.println("Galleta: "+ persona.isGalleta());
    }
    public static void salir(){
        System.out.println("Que tenga un lindo dia! :)");
    }
    public static void menu(){
        System.out.println("Programa de interraccion Perrera");
        System.out.println("Menu: ");
        Scanner in = new Scanner(System.in);
        System.out.println("1. Nueva persona");
        System.out.println("2. Nuevo perro");
        System.out.println("3. Sacar galleta");
        System.out.println("4. Interacruar");
        System.out.println("5. Salir");
        System.out.println("Ingrese la opcion a realizar");
        op = in.nextInt();
        switch (op){
            case 1: nuevaPersona(); break;
            case 2: nuevoPerro(); break;
            case 3: sacarGalleta(nuevaPersona()); break;
            case 4: interactuar(nuevoPerro(),nuevaPersona()); break;
        }
    }
}
