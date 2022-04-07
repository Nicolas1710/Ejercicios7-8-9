package ejercicio6;

import java.util.ArrayList;
import java.util.LinkedList;

public class ejercicio6 {

    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        System.out.println("Elementos: " + lista);

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        System.out.println("Elementos: " + listaEnlazada);
    }

}
//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.