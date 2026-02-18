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
        auto1.acelerar(50);
        auto1.frenar(3);
        auto1.apagar(false);

        System.out.println();

        auto2.mostrarInformacion();
        auto2.acelerar(70);
        auto2.frenar(5);
        auto2.apagar(false);
    }
}