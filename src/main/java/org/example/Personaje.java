package org.example;
import java.util.List;

public abstract class Personaje {

    private String nombre, clasePersonaje, descripcion, apodo;

    private double dineroInicial;

    private List<String> capacidades;
    private int nivel;

    public Personaje(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                     List<String> capacidades, int nivel){
        this.nombre = nombre;
        this.clasePersonaje = clasePersonaje;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.capacidades = capacidades;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasePersonaje() {
        return clasePersonaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getApodo() {
        return apodo;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public List<String> getCapacidades() {
        return capacidades;
    }

    public int getNivel() {
        return nivel;
    }

    public abstract BuilderPersonaje builder();
}
