package org.example;
import java.util.List;
import java.util.ArrayList;

public class BuilderMago implements BuilderPersonaje{
    private String nombre;
    private String clasePersonaje;
    private String descripcion;
    private String apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;
    private double inteligencia;
    private double sabiduria;
    private double energiaMagica;

    private BuilderMago() {
        this.capacidades = new ArrayList<>();
    }

    public BuilderPersonaje nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public BuilderPersonaje clasePersonaje(String clasePersonaje) {
        this.clasePersonaje = clasePersonaje;
        return this;

    }
    public  BuilderPersonaje descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public BuilderPersonaje apodo(String apodo){
        this.apodo = apodo;
        return this;
    }

    public BuilderPersonaje dineroInicial(double dineroInicial){
        this.dineroInicial = dineroInicial;
        return this;
    }

    public BuilderPersonaje capacidades(List<String> capacidades) {
        this.capacidades = capacidades;
        return this;
    }

    public BuilderPersonaje nivel(int nivel){
        this.nivel = nivel;
        return this;
    }

    public BuilderPersonaje inteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    public BuilderPersonaje sabiduria(double sabiduria){
        this.sabiduria = sabiduria;
        return this;
    }

    public BuilderPersonaje energiaMagica(double energiaMagica){
        this.energiaMagica = energiaMagica;
        return this;
    }

    public void reset(){

    }

    public Mago build() {
        return new Mago(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel, inteligencia, sabiduria, energiaMagica);
    }
}
