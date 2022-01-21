package relacionEjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int numPositivos = 0, numNegativos = 0, numCeros=0;

        //Control de intro de datos
        boolean introDatos = false;

        //Creamos un arr de 10
        int[] lista = new int[10];

        //Recoleccion de 10 datos
        for (int i = 0; i < lista.length; i++) {

            //Control solo numeros enteros
            do {

                try {

                    System.out.println("Dime el numero:");
                    num = teclado.nextInt();
                    lista[i] = num;
                    introDatos = false;

                } catch (InputMismatchException ime) {

                    System.out.println("Introduzca un NUMERO de personas");
                    introDatos = true;
                    //Limpieza de buffer
                    teclado.nextLine();

                }

            } while (introDatos);

            for (int j = 0; j < lista.length; j++) {
                if (lista[j]<0) {
                    numNegativos++;
                }else if(lista[j]>0){
                    numPositivos++;
                }else{
                    numCeros++;
                }
            }

        }
    }

    
    
}
