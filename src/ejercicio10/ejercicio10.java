package ejercicio10;

// Programa que nos permite analizar 5 ventas de una tienda, encontrara cuantas ventas fueron mayores a 2000 dolares y tambien calcula la suma total de todas las ventas que son mayores a los 2000 dolares, facilitandonos un mejor control de ingresos.

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int ventas[]=new int[5];
        int ventasMayor = 0;
        int ventasMenor = 0;
        int suma = 0;
        int sumaTotal = 0;
        for(int i = 0; i<ventas.length; i++){
            System.out.println("Ingrese su " + (i + 1) + "º" + " venta: ");
            ventas[i]= sc.nextInt();
            if(ventas[i]>2000){
                ventasMayor++;
            } else {
                ventasMenor++;
            }
        }
        System.out.println();
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > 2000) {
                System.out.println("La venta " + (i + 1) + "°" + " es mayor a $2000 dolares");
            }
        }
        System.out.println();
        if (ventasMayor == 0) {
            System.out.println("Ninguna de las ventas fueron mayores a $2000 dolares");
        } else {
           System.out.println("Total de ventas mayores a $2000 dolares");
           System.out.println("Hay un total de: " + ventasMayor + " ventas mayores a $2000 dolares");
        }
        System.out.println();
       if (ventasMenor == 0) {
            System.out.println("Ninguna de las ventas fueron menores a $2000 dolares");
        } else {
            System.out.println("Total de ventas menores a $2000 dolares");
            System.out.println("Hay un total de: " + ventasMenor + " ventas menores a $2000 dolares");
       }
        System.out.println();
       for(int i = 0; i < ventas.length; i++) {
           if(ventas[i] > 2000){
               suma = suma + ventas[i];
              }
       }
        sumaTotal = suma;
        System.out.println("La suma total de todas las ventas mayores a los 2000 dolares es: " + sumaTotal);

    }
}
//Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
