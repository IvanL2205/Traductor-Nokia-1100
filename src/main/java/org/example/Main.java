package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("A continuación deberá ingresar la cantidad de números de cada letra. " +
                "\nPara esto deberá presionar ingresar la cantidad de números correspondientes de cada letra " +
                "\n Por ejemplo para obtener la letra \"a\" debe ingresar un solo dos(2), por el contrario, " +
                "\nsi desea obtener la letra \"c\" deberá ingresar tres veces dos(222). para continuar " +
                "\ningresando cada código y formar su frase/palabra, debe separar los códigos por guines medios \"-\"."+
                "\nSi desea ingresar número naturales, por favor digitelos seguidos del uno(1)");

        Traductor.teclado();

    }
}