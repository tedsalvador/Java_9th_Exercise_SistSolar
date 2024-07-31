package com.example.sistsolar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMain() {
        Main.main(new String[]{});

        String output = outContent.toString();
        System.setOut(originalOut);

        // Verificar salida para Tierra
        assertThat(output, containsString("Nombre del planeta = Tierra"));
        assertThat(output, containsString("Cantidad de satélites = 1"));
        assertThat(output, containsString("Masa del planeta = 5.9736E24"));
        assertThat(output, containsString("Volumen del planeta = 1.08321E12"));
        assertThat(output, containsString("Diámetro del planeta = 12742"));
        assertThat(output, containsString("Distancia al sol = 150000000"));
        assertThat(output, containsString("Tipo de planeta = TERRESTRE"));
        //assertThat(output, containsString("Es observable = true"));
        //assertThat(output, containsString("Densidad del planeta = 5514.0"));
        assertThat(output, containsString("Es planeta exterior = false"));

        // Verificar salida para Júpiter
        assertThat(output, containsString("Nombre del planeta = Júpiter"));
        assertThat(output, containsString("Cantidad de satélites = 79"));
        assertThat(output, containsString("Masa del planeta = 1.899E27"));
        assertThat(output, containsString("Volumen del planeta = 1.4313E15"));
        assertThat(output, containsString("Diámetro del planeta = 139820"));
        assertThat(output, containsString("Distancia al sol = 750000000"));
        assertThat(output, containsString("Tipo de planeta = GASEOSO"));
        //assertThat(output, containsString("Es observable true"));
        //assertThat(output, containsString("Densidad del planeta = 1326.0"));
        assertThat(output, containsString("Es planeta exterior = true"));
    }
}
