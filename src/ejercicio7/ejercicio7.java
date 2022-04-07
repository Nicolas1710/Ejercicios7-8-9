package ejercicio7;

import java.util.ArrayList;

public class ejercicio7 {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=10; i++){
            list.add(i);
           System.out.println(list.get(i));
        }

        System.out.println("Lista sin numeros pares: ");

        for(int i=0; i<=list.size(); i++){
            if(list.get(i) %2 == 0){
                list.remove(i);
            }
                System.out.println(list.get(i));
        }

    }
}

//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

