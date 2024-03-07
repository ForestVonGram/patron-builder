package co.edu.uniquindio.poo;

import java.util.List;

public abstract class Personaje{
    private String nombre, clasePersonaje, descripcion, apodo;
    private double dineroInicial;
    private List<String> capacidades;
    private int nivel;

    public Personaje(String nombre, String clasePersonaje, String descripcion, String apodo, double dineroInicial,
                    List<String> capacidades, int nivel){

        assert nombre != null && !nombre.isBlank():"El nombre no es válido";
        assert clasePersonaje != null && !clasePersonaje.isBlank():"La clase no es válida";
        assert descripcion != null && !descripcion.isBlank():"La descripcion no es válida";
        assert apodo != null && !apodo.isBlank():"El apodo no es válido";
        assert dineroInicial > 0:"El donero no es válido";
        assert listaValida(capacidades):"La lista no es válida";
        assert nivel > 0:"El nivel no es válido";
        
        this.nombre = nombre;
        this.clasePersonaje = clasePersonaje;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
        this.capacidades = capacidades;
        this.nivel = nivel;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }public String getClasePersonaje() {
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
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setClasePersonaje(String clasePersonaje) {
        this.clasePersonaje = clasePersonaje;
    }public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }public void setApodo(String apodo) {
        this.apodo = apodo;
    }public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }public void setCapacidades(List<String> capacidades) {
        this.capacidades = capacidades;
    }public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private boolean listaValida(List<String> lista){
        boolean esValido = false;
        for (String texto : lista) {
            if (texto != null && !texto.isBlank()) {
                esValido = true;
            }
        }
        return esValido;
    }
}
