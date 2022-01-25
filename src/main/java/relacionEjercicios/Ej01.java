package relacionEjercicios;

import java.util.Random;

public class Ej01 {
    Scanner teclado = new Scanner(System.In);

    public static void main(String[] args) {
        int resultado=0;
        int[] lista = {1, 2, 3, 4, 5, 6};
        Random ran = new Random();

        for (int i = 0; i < lista.length; i++) {
            System.out.println(resultado+=lista[i]);
        }
    }
}
