// src/main/java/com/automovil/Main.java
package com.example.sistsolar;

import com.example.sistsolar.service.SistSolarService;

public class Main {
    public static void main(String[] args) {
        SistSolarService service = new SistSolarService();
        service.crearPlanetas();
    }
}

