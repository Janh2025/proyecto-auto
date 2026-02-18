package com.actividad;

public class Auto {
    public String marca;
    public String modelo;
    public String color;

    public void acelerar() {
        System.out.println("El auto está acelerando a 50 km/h.");
    }

    public void frenar() {
        System.out.println("El auto está frenando, su velocidad esta disminuyendo.");
    }

    public void apagar() {
        System.out.println("El auto está apagado.");
    }

    public void mostrarInformacion() {
        System.out.println("Información del Auto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}
