package co.edu.uniquindio.poo;

import java.util.List;

public interface BuilderPersonaje {
    public void reset();
    public BuilderPersonaje nombre(String nombre);
    public BuilderPersonaje clasePersonaje(String clasePersonaje);
    public BuilderPersonaje descripcion(String descripcion);
    public BuilderPersonaje apodo(String apodo);
    public BuilderPersonaje dineroInicial(double dineroInicial);
    public BuilderPersonaje capacidades(List<String> capacidades);
    public BuilderPersonaje nivel(int nivel);
    public Personaje build();
}
