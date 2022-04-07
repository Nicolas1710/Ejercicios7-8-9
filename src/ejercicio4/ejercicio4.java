package ejercicio4;

import java.util.Vector;

public class ejercicio4 {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        vector.remove(3);
        System.out.println("Datos del vector: " + vector);



    }
}
//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.