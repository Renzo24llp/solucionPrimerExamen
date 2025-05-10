/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta4;

/**
 *
 * @author USUARIO
 */
public class Pregunta4 {
       public static void main(String[] args) {
        char[] arr = {'m','p','o','m','o','m','p'};

        for (int i = 0; i < arr.length; i++) {
            // Verificar si ya fue contado usando una bandera implícita (con return)
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break; // ya fue contado
                }
            }

            // Si j == i, es la primera vez que aparece
            if (j == i) {
                int count = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
       
     }
}
    
    
    

