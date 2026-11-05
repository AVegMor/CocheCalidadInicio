package org.example;

public class Coche {

   private int s;

    public Coche(int s) {
        this.s = s;
    }

    public String verificarVelocidad(int limite) {
        String mensaje = "";
        if (s > 120) {
            if (limite > 100) {
                if (s > 150) {
                    mensaje = "Velocidad extremadamente alta";
                } else {
                    mensaje = "Velocidad alta";
                }
            } else if (limite > 80) {
                mensaje = "Velocidad por encima del límite";
            } else {
                mensaje = "Velocidad dentro del límite";
            }
        } else if (s > 60) {
            mensaje = "Velocidad moderada";
        } else {
            mensaje = "Velocidad baja";
        }
        return mensaje;
    }

    public int acelerar() {
        this.s += 10;
        return this.s;
    }

    public int incrementarVelocidad() {
        this.s += 10;
        return this.s;
    }

    public int getVelocidad() {
        return this.s;
    }
}
