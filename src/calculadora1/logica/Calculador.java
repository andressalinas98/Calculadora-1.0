package calculadora1.logica;

/**
 *
 * Esta clase hace las operaciones requeridas entre 2 numeros enteros, decimales
 * no fraccionarios
 *
 * @author Diego Velez 20172020075
 * @author Daniel Camargo 20172020078
 * @author Andres Salinas 20172020087
 *
 * @version 3.0, 14/03/2018
 * @since 0.1
 *
 */
public class Calculador {

    public int sumar(int a, int b) {
        /**
         * Realiza una suma entre 2 numeros enteros no negativos si el resultado
         * es negativo retorna -1 (error)
         *
         * @param a
         * @param b
         * @return a+b ó -1 (error)
         */
        if (a + b >= 0) {
            a += b;
        } else {
            a = -1;
        }
        return a;
    }

    public int restar(int a, int b) {
        /**
         * Realiza una resta entre 2 numeros enteros no negativos si el
         * resultado es negativo retorna -1 (error)
         *
         * @param a
         * @param b
         * @return a-b ó -1 (error)
         */
        if (a - b >= 0) {
            a -= b;
        } else {
            a = -1;
        }

        return a;
    }

    public int multiplicar(int a, int b) {
        /**
         * Realiza una multiplicacion entre 2 numeros enteros no negativos si el
         * resultado es negativo retorna -1 (error)
         *
         * @param a
         * @param b
         * @return a/b ó -1 (error)
         */
        if (a * b >= 0) {
            a *= b;
        } else {
            a = -1;
        }

        return a;
    }

    public int dividir(int a, int b) {
        /**
         * Realiza una division entre 2 numeros enteros no negativos si el
         * resultado es negativo retorna -1 (error) si el resultado no es entero
         * retorna -1 (error)
         *
         * @param a
         * @param b
         * @return a/b ó -1 (error)
         */
        if ((a / b >= 0)) {
            a /= b;
        }
        return a;
    }
}
