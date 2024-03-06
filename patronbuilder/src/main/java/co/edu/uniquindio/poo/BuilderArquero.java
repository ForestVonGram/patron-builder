package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class BuilderArquero implements BuilderPersonaje {
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double destreza, agilidad, precision;

    public BuilderArquero(){
        this.capacidades = new ArrayList<>();
    }

    public void reset(){

    }

    //Pasos
    public BuilderArquero nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public BuilderArquero clasePersonaje(String clasePersonaje){
        this.clasePersonaje = clasePersonaje;
        return this;
    }
    public BuilderArquero descripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }
    public BuilderArquero apodo(String apodo){
        this.apodo = apodo;
        return this;
    }
    public BuilderArquero dineroInicial(double dineroInicial){
        this.dineroInicial = dineroInicial;
        return this;
    }
    public BuilderArquero capacidades(List<String> capacidades){
        this.capacidades = capacidades;
        return this;
    }
    public BuilderArquero nivel(int nivel){
        this.nivel = nivel;
        return this;
    }
    public BuilderArquero destreza(double destreza){
        this.destreza = destreza;
        return this;
    }
    public BuilderArquero agilidad(double agilidad){
        this.agilidad = agilidad;
        return this;
    }
    public BuilderArquero precision(double precision){
        this.precision = precision;
        return this;
    }

    public Personaje build(){
        return new Arquero(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel, destreza, 
                            agilidad, precision);
    }
}
