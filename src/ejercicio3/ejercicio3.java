package ejercicio3;

public class ejercicio3 {

    public static void main(String[] args){

        int [][] matrix = new int[2][3];

        matrix[0][0] = 17;
        matrix[0][1] = 11;
        matrix[0][2] = 7;

        matrix[1][0] = 13;
        matrix[1][1] = 4;
        matrix[1][2] = 23;

        for(int i = 0; i <matrix.length; i++){
            System.out.println("Valor de i: " + i);


            for(int j = 0; j < matrix[1].length; j++){
                System.out.println("Estoy en i = " + i + ", en j = " + j);
                System.out.println("Segun su posicion el valor que le corresponde es:" + matrix[i][j]);
            }
        }
    }
}

// for (int i = 0; i <2; i++){
//
//            for (int j = 0; j < 3; j++){
//                System.out.println(matrix[i][j] + " ");
//            }
//        }


 //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.