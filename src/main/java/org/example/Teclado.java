package org.example;

import java.util.HashMap;
import java.util.Map;

public enum Teclado {
    TECLADO_NUMERICO;


    private Map<String, Character> tn;

    Teclado() {
        tn = new HashMap<>();
    }


    private void put(String key, Character value) {
        tn.put(key, value);
    }


    public Map<String, Character> getTn(){
        return tn;
    }

    static {
        TECLADO_NUMERICO.put("2", 'a');
        TECLADO_NUMERICO.put("22", 'b');
        TECLADO_NUMERICO.put("222", 'c');
        TECLADO_NUMERICO.put("3", 'd');
        TECLADO_NUMERICO.put("33", 'e');
        TECLADO_NUMERICO.put("333", 'f');
        TECLADO_NUMERICO.put("4", 'g');
        TECLADO_NUMERICO.put("44", 'h');
        TECLADO_NUMERICO.put("444", 'i');
        TECLADO_NUMERICO.put("5", 'j');
        TECLADO_NUMERICO.put("55", 'k');
        TECLADO_NUMERICO.put("555", 'l');
        TECLADO_NUMERICO.put("6", 'm');
        TECLADO_NUMERICO.put("66", 'n');
        TECLADO_NUMERICO.put("666", 'o');
        TECLADO_NUMERICO.put("7", 'p');
        TECLADO_NUMERICO.put("77", 'q');
        TECLADO_NUMERICO.put("777", 'r');
        TECLADO_NUMERICO.put("7777", 's');
        TECLADO_NUMERICO.put("8", 't');
        TECLADO_NUMERICO.put("88", 'u');
        TECLADO_NUMERICO.put("888", 'v');
        TECLADO_NUMERICO.put("9", 'w');
        TECLADO_NUMERICO.put("99", 'x');
        TECLADO_NUMERICO.put("999", 'y');
        TECLADO_NUMERICO.put("9999", 'z');
        TECLADO_NUMERICO.put("0", ' ');
        TECLADO_NUMERICO.put("*", '+');
    }



}
