package org.example;

import java.util.Scanner;

public class Validaciones {

    public static String validaGuionDoble(String codigo){
        Scanner sc = new Scanner(System.in);
        while (codigo.contains("--")){
            System.err.println("Se ha encntrado un guión doble, y esto no es un código válido. Por favor ingrese un código válido");
            codigo = sc.next();
        }
        return codigo;
    }

}
