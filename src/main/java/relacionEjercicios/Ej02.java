package relacionEjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean repetirNumPersonas = false;
        boolean repetirAltura = false;

        int numPersonas = 0;
        

        do {

            try {
                
                System.out.println("Dime el numero de personas:");
                numPersonas = teclado.nextInt();

            } catch (InputMismatchException ime) {
                
                System.out.println("Introduzca un NUMERO de personas");
                repetirNumPersonas = true;
            }

        } while (repetirNumPersonas);

        int[]lista = new int[numPersonas];

        for (int i = 0; numPersonas < --i; i++) {
            do {
                
                try {
                    
                    System.out.println("Introduzca altura (cm)" + (i++) + "/" + numPersonas);
                    lista[i] = teclado.nextInt();
                } catch (InputMismatchException ime) {
                    
                    System.out.println("Introduzca la ALTURA en CM de la persona");
                    repetirAltura= true;
                }
                
                lista[i]=Math.abs(i);
                
            } while (repetirAltura);
            
            

        }

    }

}
