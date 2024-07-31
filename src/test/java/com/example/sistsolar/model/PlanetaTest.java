package com.example.sistsolar.model;

import com.example.sistsolar.enums.TipoPlaneta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PlanetaTest {

    @Test
    public void testCalcularDensidad() {
        // Prueba para el planeta Tierra
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE, true,1,365);
        double densidadEsperadaTierra = 5.9736E24 / 1.08321E12;
        assertThat(tierra.calcularDensidad(), closeTo(densidadEsperadaTierra, 1.0));

        // Prueba para el planeta Júpiter
        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, TipoPlaneta.GASEOSO, true,1,365);
        double densidadEsperadaJupiter = 1.899E27 / 1.4313E15;
        assertThat(jupiter.calcularDensidad(), closeTo(densidadEsperadaJupiter, 1.0));
    }

    @Test
    public void testEsPlanetaExterior() {
        // Prueba para el planeta Tierra
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE, true,1,365);
        assertThat(tierra.esPlanetaExterior(), is(false));

        // Prueba para el planeta Júpiter
        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, TipoPlaneta.GASEOSO, true,12,10);
        assertThat(jupiter.esPlanetaExterior(), is(true));
    }
}
