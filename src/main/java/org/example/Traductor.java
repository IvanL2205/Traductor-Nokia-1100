package org.example;

import java.util.Scanner;

import static org.example.Teclado.*;

public class Traductor {
    static StringBuilder codigo;
    public static String getChar(String clave) {
        String letra = "";
        Scanner sc = new Scanner(System.in);
        if (!TECLADO_NUMERICO.getTn().containsKey(clave)) {
            System.err.println("El código " + clave + " no ha sido encontrado. Ingrese una clave correcta");
            System.out.print("Código nuevo: ");
            clave = sc.next();
            letra = getChar(clave);
        } else {
            letra = TECLADO_NUMERICO.getTn().get(clave).toString();
        }
        return letra;
    }

    public static String teclado() {

        Scanner sc = new Scanner(System.in);
        String codigo ;
        System.out.println("Si desea poner una mayúscula deberá poner un \"#\" antes del código");
        System.out.println("Ingrese la clave de la letra que desea digitar: ");
        System.out.println("""
                  1       2       3
                 num     abc     def
                  4       5       6
                 ghi     jkl     mno
                  7       8       9
                 pqrs    tuv     wxyz
                  *       0       #
                  +      !_!     mayus.""");

        System.out.print("Clavee: ");
        codigo = sc.next();
        codigo = Validaciones.validaGuionDoble(codigo);
        StringBuilder sb = new StringBuilder();
        String[] palabra = codigo.split("-");
        for (String letra : palabra) {
            if (letra.contains("1")){
                letra = letra.replaceFirst("1", "");
                sb.append(letra);
                continue;
            }
            if (letra.contains("#")) {
                letra = letra.replace("#", "");
                sb.append(getChar(letra).toUpperCase());

            } else {
                sb.append(getChar(letra));
            }
        }
        return sb.toString();
    }
}