/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1.logica;

/**
 *
 * esta clase convierte un numero de cualquier base en base decimal o viceversa
 *
 * @author Diego Velez 20172020075
 * @author Daniel Camargo 20172020078
 * @author Andres Salinas 20172020087
 *
 * @version 5.0, 14/03/2018
 * @since 0.1
 *
 */
public class Conversor {

    private int a;
    private int b;
    Calculador operaciones = new Calculador();

    public void convertirStringA(String a,int base) {
        /**
         * @param a
         * @return a,base
         */
        this.a = Integer.parseInt(a,base);
    }
    public void convertirStringB(String b,int base) {
        /**
         * @param b
         * @return b,base
         */
        this.b = Integer.parseInt(b,base);
    }

    public String convertirInt(int a,int base) {
        /**
         * @param a
         * @return stra
         */
        String stra = Integer.toString(a,base);
        return stra;
    }
    
    public String cambiarStr(String str, int base1, int base2) {
        /**
         * @param base1
         * @param base2
         * @return stra
         */
        int n = Integer.parseInt(str,base1);
        String stra = Integer.toString(n,base2);
        return stra;
    }

    public String operar(int base, int op) {
        /**
         * @param a
         * @param b
         * @return suma
         * @return restar
         * @return multiplicar
         * @return dividir
         */
        int c=0;
        switch (op) {
            case 1:
                c = operaciones.sumar(a, b);
                break;
            case 2:
                c = operaciones.restar(a, b);
                
                break;
            case 3:
                c = operaciones.multiplicar(a, b);
                break;
            case 4:
                c = operaciones.dividir(a, b);
                break;
        }
        String resultado=convertirInt(c,base);
        if ("-1".equals(resultado)){
            resultado="ERROR";
        }
        return resultado;
    }
}
