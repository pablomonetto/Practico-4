package javaapplication4;

import java.util.Scanner;

public class Actividad_1_A_B_C {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int salida[] = {0, 0, 0};
        int aux = 0, x, y;

        System.out.println("Ingrese 3 numeros separados por un espacio:");    //obtencion de datos
        String cadena = entrada.nextLine();

        System.out.println("Indique orden ascendente (a) o descendente (d):");//acendente "a" o descendente "d"
        String orden = entrada.nextLine();

        String[] cadenaSep = cadena.split(" ");                            //cambio de variable de String a int
        for (x = 0; x < 3; x++) {
            int a = Integer.parseInt(cadenaSep[x]);
            salida[x] = a;
        }

        if (orden.equals("d")) {                                         //metodo de burbuja para ordenar mayor a menor
            for (x = 0; x < 2; x++) {
                for (y = 0; y < 2; y++) {
                    {
                        if (salida[y] < salida[y + 1]) {
                            aux = salida[y];
                            salida[y] = salida[y + 1];
                            salida[y + 1] = aux;
                        }
                    }
                }
            }
        }

        if (orden.equals("a")) {                                         //metodo de burbuja para ordenar de menor a mayor
            for (x = 0; x < 2; x++) {
                for (y = 0; y < 2; y++) {
                    {
                        if (salida[y] > salida[y + 1]) {
                            aux = salida[y];
                            salida[y] = salida[y + 1];
                            salida[y + 1] = aux;
                        }
                    }
                }
            }
        }
        
        else
            System.out.println("\nMetodo de entrada invalido..\nno se produjo modificacion en el vector");
        
        //muestro el resultado en el vector b
        System.out.println("\nNumeros en orden seleccionado:");
        for (x = 0; x <= 2; x++) {
            System.out.println(salida[x]);
        }

    }
}
