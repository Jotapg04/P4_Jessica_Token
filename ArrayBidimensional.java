/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw.arraybidimensional;

/**
 *
 * @author jessi
 */
public class ArrayBidimensional {

    public static void main(String[] args) {
        int [][] array = new int [4][4];
        int k = 1;
        int suma = 0;
        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4;j++){
                
                array[i][j] = k;
                k++;
            }
        
        }
        System.out.println("[");
        
        for (int[] fila : array) {
            
		System.out.print("[ ");
                        
            for (int a: fila) {
                
                System.out.print(a + " ");
		suma = suma + a;
            }
            System.out.println("]"); // Saltar a la siguiente fila
        }
		System.out.print("]");
                System.out.println();
		System.out.println("La suma és: " + suma);
            
    }
}
