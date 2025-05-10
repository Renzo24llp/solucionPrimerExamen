/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta3;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Pregunta3 {

   public static void main(String[] args) {
        int p = 0; // suma de pares
        int q = 0; // suma de impares

        int arr[] = {11, 14, 19, 20, 25, 22};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) { // si el número es par
                p += arr[i];
            } else { // si el número es impar
                q += arr[i];
            }
        }

        int resultado = p - q;
        System.out.println("Resultado = " + resultado);
    }
}       
        
        
        // TODO code application logic here
    
    

