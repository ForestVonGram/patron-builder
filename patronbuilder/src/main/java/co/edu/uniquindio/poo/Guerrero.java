package co.edu.uniquindio.poo;

import java.util.List;

public class Guerrero extends Personaje{
    private double fuerza, resistencia, vitalidad;

    public Guerrero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial, 
                    List<String> capacidades, int nivel, double fuerza, double resistencia, double vitalidad){
        
        super(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel);
        
        assert fuerza > 0:"La fuerza no es válida";
        assert resistencia > 0:"La resistencia no es válida";
        assert vitalidad > 0:"La vitalidad no es válida";
        
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
    }

    public static BuilderGuerrero builder(){
        return new BuilderGuerrero();
    }
    
    //Getters
    double getFuerza() {
        return fuerza;
    }public double getResistencia() {
        return resistencia;
    }public double getVitalidad() {
        return vitalidad;
    }

    //Setters
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }public void setVitalidad(double vitalidad) {
        this.vitalidad = vitalidad;
    }

    //Habilidades
    public double espadaAfilada() {
        return fuerza*1.13;
    }
    public double golpeDefinitivo() {
        return fuerza*1.25;
    }
    public double vitalidad() {
        return vitalidad*0.45;
    }

}
