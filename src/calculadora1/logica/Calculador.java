/*
 * @(#)Calculador.java 1.0 11/03/2018
 * 
 * Copyright 2018 Fenix, Inc. All rights reserved.
 * DIEFEX PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package calculadora1.logica;

/**
 *
 * esta clase hace las operaciones requeridas entre 2 numeros enteros, decimales
 * no fraccionarios
 *
 * @author Diego Velez 20172020075
 * @author Daniel Camargo 20172020078
 * @author Andres Salinas 20172020087
 *
 * @version 1.0, 11/03/2018
 * @since 0.1
 *
 */
public class Calculador {

    /**
     * realiza una suma entre 2 numeros enteros no negativos
     * si el resultado es negativo retorna -1 (error)
     * @param a
     * @param b
     * @return a+b ó -1 (error)
     */
    public int Sumar(int a, int b) {

        if (a + b >= 0) {
            a += b;
        } else {
            a = -1;
        }
        return a;
    }
    
    /**
     * realiza una resta entre 2 numeros enteros no negativos
     * si el resultado es negativo retorna -1 (error)
     * @param a
     * @param b
     * @return a-b ó -1 (error)
     */
    public int Restar(int a, int b) {

        if (a - b >= 0) {
            a -= b;
        } else {
            a = -1;
        }
        
        return a;
    }
    
    /**
     * realiza una multiplicacion entre 2 numeros enteros no negativos
     * si el resultado es negativo retorna -1 (error)
     * @param a
     * @param b
     * @return a/b ó -1 (error)
     */
    public int Multiplicar(int a, int b) {

        if (a * b >= 0) {
            a *= b;
        } else {
            a = -1;
        }

        return a;
    }

    /**
     * realiza una division entre 2 numeros enteros no negativos
     * si el resultado es negativo retorna -1 (error)
     * si el resultado no es entero retorna -1 (error)
     * @param a
     * @param b
     * @return a/b ó -1 (error)
     */
    public int Dividir(int a, int b) {

        if ((a % b == 0) && (a / b >= 0)) {
            a /= b;
        } else {
            a = -1;
        }

        return a;
    }
}
