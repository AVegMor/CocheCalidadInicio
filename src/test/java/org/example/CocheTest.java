package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CocheTest {

    @Test
    @DisplayName("Más de 150 con límite mayor de 100: extremadamente alta")
    void velocidadExtremadamenteAlta() {
        Coche coche = new Coche(160);
        assertEquals("Velocidad extremadamente alta", coche.verificarVelocidad(110));
    }

    // TODO: añade los tests que faltan hasta cubrir todas las ramas de la clase Coche.
    // SonarQube te dirá qué líneas y condiciones quedan sin probar.
}
