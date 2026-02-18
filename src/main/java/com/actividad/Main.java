package com.actividad;

public class Main {
    public static void main(String[] args) {        
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.color = "Rojo";
        auto1.marca =  "Renault";
        auto1.modelo = "Logan";

        auto2.color = "Gris";
        auto2.marca = "Chevrolet";
        auto2.modelo = "Spark";

        auto1.mostrarInformacion();
        auto1.acelerar();
        auto1.frenar();
        auto1.apagar();

        System.out.println();

        auto2.mostrarInformacion();
        auto2.acelerar();
        auto2.frenar();
        auto2.apagar();
    }
}