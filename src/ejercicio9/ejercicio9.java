package ejercicio9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ejercicio9 {

    public static void main(String[] args){

            try{
                InputStream fileIn = new FileInputStream("C:\\Users\\Nicolas\\Desktop\\OB.txt");
                byte[] dato = fileIn.readAllBytes();

                PrintStream fileOut = new PrintStream("C:\\Users\\Nicolas\\Desktop\\destino.txt");
                fileOut.write(dato);

            } catch(Exception e){
                System.out.println("Excepcion: " + e.getMessage());
            }

    }
}

//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
