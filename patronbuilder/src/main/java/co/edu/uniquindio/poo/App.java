package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> capacidades = new ArrayList<>();
        capacidades.add("Derivar");
        capacidades.add("Integrar");

        Personaje mago = Mago.builder().nombre("diferecial de x").apodo("dx")
                .clasePersonaje("Mago")
                .descripcion("Miembro de la quinta disciplina")
                .dineroInicial(800.0)
                .capacidades(capacidades)
                .build();
    }
}
