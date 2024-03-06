package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> capacidades1 = new ArrayList<>();
        capacidades1.add("Derivar");
        capacidades1.add("Integrar");

        Personaje mago = Mago.builder().nombre("diferecial de x").apodo("dx")
                .clasePersonaje("Mago")
                .descripcion("Miembro de la quinta disciplina")
                .dineroInicial(800.0)
                .capacidades(capacidades1)
                .nivel(15)
                .inteligencia(300.0)
                .sabiduria(300.0)
                .energiaMagica(350.0)
                .build();

        List<String> capacidades2 = new ArrayList<>();
        capacidades2.add("Pensamiento Sistémico");

        Personaje guerrero = Guerrero.builder().nombre("Wiliam").apodo("Will")
                .clasePersonaje("Guerrero")
                .descripcion("Ingeniero Original")
                .dineroInicial(999999.9)
                .capacidades(capacidades2)
                .nivel(80)
                .fuerza(500.0)
                .resistencia(450)
                .vitalidad(200.0)
                .build();

        List<String> capacidades3 = new ArrayList<>();
        capacidades3.add("david");
        capacidades3.add("david");

        Personaje arquero = Arquero.builder().nombre("david").apodo("david")
                .clasePersonaje("david")
                .descripcion("david")
                .dineroInicial(11111.1)
                .capacidades(capacidades3)
                .nivel(11)
                .destreza(111.1)
                .agilidad(11.1)
                .precision(1.1)
                .build();
    }
}
