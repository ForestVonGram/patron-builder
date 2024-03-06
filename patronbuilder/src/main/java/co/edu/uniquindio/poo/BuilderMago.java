package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class BuilderMago implements BuilderPersonaje {
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double inteligencia, sabiduria, energiaMagica;

    public BuilderMago(){
        this.capacidades = new ArrayList<>();
    }

    //Pasos
    public BuilderMago nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public BuilderMago clasePersonaje(String clasePersonaje){
        this.clasePersonaje = clasePersonaje;
        return this;
    }
    public BuilderMago descripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }
    public BuilderMago apodo(String apodo){
        this.apodo = apodo;
        return this;
    }
    public BuilderMago dineroInicial(double dineroInicial){
        this.dineroInicial = dineroInicial;
        return this;
    }
    public BuilderMago capacidades(List<String> capacidades){
        this.capacidades = capacidades;
        return this;
    }
    public BuilderMago nivel(int nivel){
        this.nivel = nivel;
        return this;
    }
    public BuilderMago inteligencia(double inteligencia){
        this.inteligencia = inteligencia;
        return this;
    }
    public BuilderMago sabiduria(double sabiduria){
        this.sabiduria = sabiduria;
        return this;
    }
    public BuilderMago energiaMagica(double energiaMagica){
        this.energiaMagica = energiaMagica;
        return this;
    }
    public void reset(){

    }

    //Constructor
    public Personaje build(){
        return new Mago(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel, inteligencia,
                        sabiduria, energiaMagica);
    }
}
