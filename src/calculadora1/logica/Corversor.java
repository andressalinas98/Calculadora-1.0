/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1.logica;

/**
 *
 * esta clase convierte un numero de cualquier base en base decimal
 * o viceversa
 *
 * @author Diego Velez 20172020075
 * @author Daniel Camargo 20172020078
 * @author Andres Salinas 20172020087
 *
 * @version 0.1, 11/03/2018
 * @since 0.1
 *
 */
public class Corversor {
    public int a;
    public int b;
    
    public void convertirString(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }
    
    public String convertirInt(int a) {
        String stra = String.valueOf(a);
        return stra;
    }
    
}
