package ar.charlycimino.ejemplos.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Auto a1 = new Auto("ABC123", "Verde");
//        Auto a2 = new Auto("DEF456", "Rojo");
//        Auto a3 = new Auto("GHI789", "Azul");

        ArrayList<Auto> misAutos = new ArrayList<>();

        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(new Auto("DEF456", "Rojo"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");

        misAutos.add(new Auto("GHI789", "Azul"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("**********************");
        System.out.println("El 2º auto es: " + misAutos.get(1));

        System.out.println("**********************");
        System.out.println("Mostrando todos los autos de la lista:");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion " + i + " es " + misAutos.get(i));
        }

        System.out.println("**********************");

        misAutos.remove(0);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

    }

}
