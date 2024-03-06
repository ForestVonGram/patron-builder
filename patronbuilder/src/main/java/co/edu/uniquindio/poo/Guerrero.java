package co.edu.uniquindio.poo;

import java.util.List;

public class Guerrero extends Personaje{
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double fuerza, resistencia, vitalidad;

    public Guerrero(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial, 
                    List<String> capacidades, int nivel, double fuerza, double resistencia, double vitalidad){
        
        this.nombre = nombre;
        this.clasePersonaje = clasePersonaje;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.capacidades = capacidades;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
    }

    public static BuilderGuerrero builder(){
        return new BuilderGuerrero();
    }
    
    //gets
    public String getNombre() {
        return nombre;
    }public String getClasePersonaje(){
        return clasePersonaje;
    }public String getDescripcion() {
        return descripcion;
    }public String getApodo() {
        return apodo;
    }public double getDineroInicial() {
        return dineroInicial;
    }public List<String> getCapacidades() {
        return capacidades;
    }public int getNivel() {
        return nivel;
    }public double getFuerza() {
        return fuerza;
    }public double getResistencia() {
        return resistencia;
    }public double getVitalidad() {
        return vitalidad;
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
