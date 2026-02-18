package com.actividad;

public class Auto {
    public String marca;
    public String modelo;
    public String color;

    public int velocidadActual;
    public boolean encendido;

    public void acelerar(int cantidad) {
        if (cantidad >= 0) {
        System.out.println("El auto " + modelo + " está acelerando a " + cantidad + " km/h");}
    }

    public void frenar(int cantidad) {
        if (cantidad <= 5)
        System.out.println("El auto está frenando, la velocidad disminuyó a " + cantidad + " km/h");
    }

    public void apagar(boolean encendido) {
        if (encendido) {
            encendido = false;
            System.out.println("El auto está apagado.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información del Auto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}
