package ejercicio1;

public class ejercicio1 {
    public static void main(String[] args) {

        String r = reverse("Hola Mundo!");
        System.out.println(r);
    }

    public static String reverse(String s){

        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for(int i = s.length()-1; i >= 0; i--){
            letters[letterIndex]=s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse=reverse+letters[i];
        }
        return reverse;
    }
}

//Dada la función:
//public static String reverse(String texto) {}
//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

