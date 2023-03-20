package javaapplication4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;                                                     //librerias añadidas automaticamente al utilizar...
import java.util.logging.Level;                                                 //la funcion TRY - CATCH
import java.util.logging.Logger;

import java.util.Scanner;

public class Actividad_2 {

    public static void main(String[] args) {

        int sumatoria = 0;
        Scanner entrada = new Scanner(System.in);
        String archivo = "C:\\Users\\pablo\\OneDrive\\Documentos\\JAVA\\Clase 4\\Archivo.txt";
        
        System.out.println("Desea multiplicar \"m\" o sumar \"s\" los valores del archivo?");
        String operacion = entrada.nextLine();
        char op = operacion.charAt(0);                                     //verifico si se introdujo una m o s. De esta forma trabajo...
                                                                                //sobre el caracter y no sobre el string.
        
        if(op == 'm') sumatoria=1;                                              //al ser multiplicacion, si sumatoria esta inicializado...
                                                                                //en 0, la multiplicacion da como resultado 0. Por eso...
                                                                                //lo cambio a 1.
        try {
            
            for (String lectura : Files.readAllLines(Paths.get(archivo))) {
                switch (op){                                                    //en vez de utilizar if-else anidados, java sugirió switch-case.
                    case 's':
                        sumatoria = sumatoria + Integer.parseInt(lectura);
                        break;
                    case 'm':
                        sumatoria = sumatoria * Integer.parseInt(lectura);
                        break;
                    default:                                                    
                        break;
                }
            }
            System.out.println("Resultado:" + sumatoria);

            }catch (IOException ex) {
            System.out.println("Error al leer el archivo");
            }

    }

}
