package com.example.sistsolar.service;

import com.example.sistsolar.enums.TipoPlaneta;
import com.example.sistsolar.model.Planeta;

public class SistSolarService {

    public void crearPlanetas(){
    Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,TipoPlaneta.TERRESTRE,true,1,365);
    p1.imprimir();
    System.out.println("Densidad del planeta = " + p1.calcularDensidad());
    System.out.println("Es planeta exterior = " +  p1.esPlanetaExterior());
    System.out.println();
    
    Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,750000000,TipoPlaneta.GASEOSO,true,12,1);
    p2.imprimir();
    System.out.println("Densidad del planeta = " + p2.calcularDensidad());
    System.out.println("Es planeta exterior = " +  p2.esPlanetaExterior());
    }
}