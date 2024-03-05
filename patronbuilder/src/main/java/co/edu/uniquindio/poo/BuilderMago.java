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
    public BuilderPersonaje nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public BuilderPersonaje clasePersonaje(String clasePersonaje){
        this.clasePersonaje = clasePersonaje;
        return this;
    }
    public BuilderPersonaje descripcion(String descripcion){
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
    public BuilderPersonaje capacidades(List<String> capacidades){
        this.capacidades = capacidades;
        return this;
    }
    public BuilderPersonaje nivel(int nivel){
        this.nivel = nivel;
        return this;
    }
    public BuilderPersonaje inteligencia(double inteligencia){
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
    }public double getInteligencia() {
        return inteligencia;
    }public double getSabiduria() {
        return sabiduria;
    }public double getEnergiaMagica() {
        return energiaMagica;
    }

    //Constructor
    public Personaje build(){
        return new Mago(nombre, clasePersonaje, descripcion, apodo, dineroInicial, capacidades, nivel, inteligencia,
                        sabiduria, energiaMagica);
    }
}
