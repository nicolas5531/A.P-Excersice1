package com.java_intermedio.clase3_ejercicio1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author spike
 */
public class Clase3_Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("******************* CLASE 3 - EJERCICIO 1 *******************");
        
//SE CREAR LA LISTA DE STRING PARA ALMACENAR LAS PALABRAS INGRESADAS POR TECLADO.
        List<String> listadoPalabras = new ArrayList<String>();
//SE CREA UN OBJETO DE TIPO SCANNER PARA RECIBIR DATOS DE ENTRADA POR TECLADO        
        Scanner teclado = new Scanner(System.in);
//SE COMIENZA A INGRESAR DATOS POR TECLADO HASTA QUE EL USUARIO ESCRIBA "Exit"        
        System.out.println("*********************************");
        System.out.println("Ingresar cuantas palabras desee en minuscula -Luego tecla enter y escribe la palabra clave Exit para ejecutar la conversion.");
        String palabra = teclado.nextLine();
        while(!palabra.equals("Exit")){
            listadoPalabras.add(palabra);
            palabra = teclado.nextLine();
        }

        System.out.println("*********************************");
//SE TERMINA DE INGRESAR DATOS POR TECLADO Y SE LOS MUESTRA. SE CREA UN OBJETO DE TIPO ConvertidorStrings QUE LLAMA A SU MÉTODO "palabraConvertida"        
        System.out.println("Se terminó de cargar palabras");
        System.out.println("*********************************");
        System.out.println("Se muestran las palabras convertidas a Mayúsculas.");
        ConvertidorStrings converter = new ConvertidorStrings();
        List<String> palabrasConvertidas = new ArrayList<String>();
        palabrasConvertidas = converter.palabrasConvertidas(listadoPalabras);
        
        for (String p : palabrasConvertidas) {
            System.out.println(p);
        }
    }
}
