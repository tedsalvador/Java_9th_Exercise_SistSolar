package com.example.sistsolar.service;

import com.example.sistsolar.enums.TipoPlaneta;
import com.example.sistsolar.model.Planeta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SistSolarServiceTest {
    
    //private SistSolarService sistSolarService;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
       // sistSolarService = new SistSolarService();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCrearPlanetas() {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE, true,1,365);
        assertThat(tierra.getNombre(), is("Tierra"));
        assertThat(tierra.getCantidadSatelites(), is(1));
        assertThat(tierra.getMasa(), is(5.9736E24));
        assertThat(tierra.getVolumen(), is(1.08321E12));
        assertThat(tierra.getDiametro(), is(12742));
        assertThat(tierra.getDistanciaSol(), is(150000000));
        assertThat(tierra.getTipoPlaneta(), is(TipoPlaneta.TERRESTRE));
        assertThat(tierra.isEsObservable(), is(true));

        // Calcula la densidad correcta
        double densidadEsperadaTierra = 5.9736E24 / 1.08321E12;
        assertThat(tierra.calcularDensidad(), closeTo(densidadEsperadaTierra, 1.0));
        assertThat(tierra.esPlanetaExterior(), is(false));
        
        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, TipoPlaneta.GASEOSO, true,12,1);
        assertThat(jupiter.getNombre(), is("Júpiter"));
        assertThat(jupiter.getCantidadSatelites(), is(79));
        assertThat(jupiter.getMasa(), is(1.899E27));
        assertThat(jupiter.getVolumen(), is(1.4313E15));
        assertThat(jupiter.getDiametro(), is(139820));
        assertThat(jupiter.getDistanciaSol(), is(750000000));
        assertThat(jupiter.getTipoPlaneta(), is(TipoPlaneta.GASEOSO));
        assertThat(jupiter.isEsObservable(), is(true));

        // Calcula la densidad correcta
        double densidadEsperadaJupiter = 1.899E27 / 1.4313E15;
        assertThat(jupiter.calcularDensidad(), closeTo(densidadEsperadaJupiter, 1.0));
        assertThat(jupiter.esPlanetaExterior(), is(true));
    }
}
