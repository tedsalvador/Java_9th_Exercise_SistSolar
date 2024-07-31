package com.example.sistsolar.model;

import com.example.sistsolar.enums.TipoPlaneta;

public class Planeta {
    // Atributo que define el nombre de un planeta
    String nombre = null;
    // Atributo que define la cantidad de satélites que tiene un planeta
    int cantidadSatelites = 0;
    // Atributo que define la masa de un planeta
    double masa = 0;
    // Atributo que define el volumen de un planeta
    double volumen = 0;
    // Atributo que define el diámetro de un planeta
    int diametro = 0;
    // Atributo que define la distancia al sol de un planeta
    int distanciaSol = 0;
    // Atributo que define el tipo de planeta como un valor enumerado
    //enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    private TipoPlaneta tipoPlaneta;
    // Atributo que define el tipo de planeta
    //tipoPlaneta tipo;
    // Atributo que define si el planeta es observable o no
    boolean esObservable = false;
    //adicionales
    int periodoOrbitalAnnios = 0;
    int periodoRotacionDias = 0;

    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen, 
                   int diametro,  int distanciaSol, TipoPlaneta tipoPlaneta, 
                   boolean esObservable, int periodoOrbitalAnnios, int periodoRotacionDias) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.esObservable = esObservable;
        //adicionales
        this.periodoOrbitalAnnios = periodoOrbitalAnnios;
        this.periodoRotacionDias = periodoRotacionDias;
        }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diámetro) {
        this.diametro = diámetro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public TipoPlaneta getTipoPlaneta() {
        return tipoPlaneta;
    }

/*     public void setTipo(tipoPlaneta tipo) {
        this.tipo = tipo;
    } */

    public void setTipoPlaneta(TipoPlaneta tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }
    public boolean isEsObservable() {
        return esObservable;
    }

    public void setEsObservable(boolean esObservable) {
        this.esObservable = esObservable;
    }

        /**
        * Método que imprime en pantalla los datos de un planeta
        */
        public void imprimir() {
            System.out.println("Nombre del planeta = " + nombre);
            System.out.println("Cantidad de satélites = " + cantidadSatelites);
            System.out.println("Masa del planeta = " + masa);
            System.out.println("Volumen del planeta = " + volumen);
            System.out.println("Diámetro del planeta = " + diametro);
            System.out.println("Distancia al sol = " + distanciaSol);
            System.out.println("Tipo de planeta = " + tipoPlaneta);
            System.out.println("Es observable = " + esObservable);
            System.out.println("Periodo Orbital = " + periodoOrbitalAnnios);
            System.out.println("Periodo de rotación = " + periodoRotacionDias);
        }

        public double calcularDensidad() {
            return masa/volumen;
            }
        
        public boolean esPlanetaExterior(){
            float límite = (float) (149597870 * 3.4);
            /* Un planeta exterior está situado más allá del cinturón de
            asteroides */
            /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
            149.597.870 Km) */
            if (distanciaSol > límite) {
                return true;
            } else {
                return false;
            }
            }
}

