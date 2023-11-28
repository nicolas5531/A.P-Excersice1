/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java_intermedio.clase3_ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spike
 */
public class ConvertidorStrings {
    public interface ConvertaMayuscula{
        String convert(String palabra);  
    }
    
    public List<String> palabrasConvertidas(List<String> listaPalabras){
        List<String> mayusculas = new ArrayList<String>();
        ConvertaMayuscula convertidor = (String palabra) -> palabra.toUpperCase();
        for (String p : listaPalabras) {
            String palabraConvertida = convertidor.convert(p);
            mayusculas.add(palabraConvertida);
        }
        return mayusculas;
    
    }
}
