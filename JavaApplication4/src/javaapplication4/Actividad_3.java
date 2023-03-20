package javaapplication4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Actividad_3 {

    public static void main(String[] args) {

        String ArchEntrada = "C:\\Users\\pablo\\OneDrive\\Documentos\\JAVA\\Clase 4\\Entrada.txt";
        String ArchSalida = "C:\\Users\\pablo\\OneDrive\\Documentos\\JAVA\\Clase 4\\Salida.txt";
        
        int desplazamiento = 1, y, x;                                           //VALOR DE DESPLAZAMIENTO DE PALABRAS
        String concatenar = "";
        
        try {
            for(String lectura : Files.readAllLines(Paths.get(ArchEntrada))){ 
                char[] letra = lectura.toCharArray();                           //convierto la frase en un array de caracteres para realizar el desplazamiento
                for (x = 0; x < lectura.length(); x++) {
                    for (y = 0; y < desplazamiento; y++) {
                        if (letra[x] == ' ') {                                  //para el espacio ' ', coloco el caracter 'a' segun pide el enunciado.
                            letra[x] = 'a';
                        }
                        else letra[x]++;
                    }
                }
            String fraseNueva = String.valueOf(letra);                      //conviero el array de caracteres en un string y lo muestro
            concatenar = concatenar + fraseNueva + "\n";
            Files.writeString(Paths.get(ArchSalida),concatenar);
            }
            System.out.println("Lectura y escritura exitosa");
        } catch (IOException ex) {
            System.out.println("\nNo se pudo leer el archivo.");
        }
     }
}
