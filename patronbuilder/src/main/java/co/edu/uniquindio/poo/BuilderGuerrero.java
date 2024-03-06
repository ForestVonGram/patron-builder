package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class BuilderGuerrero implements BuilderPersonaje{
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double fuerza, resistencia, vitalidad;

    public BuilderGuerrero(){
        this.capacidades = new ArrayList<>();
    }

    public void reset(){

    }

    //Pasos
    public BuilderGuerrero nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public BuilderGuerrero clasePersonaje(String clasePersonaje){
        this.clasePersonaje = clasePersonaje;
        return this;
    }
    public BuilderGuerrero descripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }
    public BuilderGuerrero apodo(String apodo){
        this.apodo = apodo;
        return this;
    }
    public BuilderGuerrero dineroInicial(double dineroInicial){
        this.dineroInicial = dineroInicial;
        return this;
    }
    public BuilderGuerrero capacidades(List<String> capacidades){
        this.capacidades = capacidades;
        return this;
    }
    public BuilderGuerrero nivel(int nivel){
        this.nivel = nivel;
        return this;
    }
    public BuilderGuerrero fuerza(double fuerza){
        this.fuerza = fuerza;
        return this;
    }
    public BuilderGuerrero resistencia(double resistencia){
        this.resistencia = resistencia;
        return this;
    }
    public BuilderGuerrero vitalidad(double vitalidad){
        this.vitalidad = vitalidad;
        return this;
    }

    public Personaje build(){
        return new Guerrero(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel,
                            fuerza, resistencia, vitalidad);
    }
}
