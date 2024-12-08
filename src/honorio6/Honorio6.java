/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio6;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Honorio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas=leer.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas=leer.nextInt();
        int[][] matriz=new int[filas][columnas];
        System.out.println("Ingresa los elementos de la matriz:");
        for(int i=0;i<filas;i++) {
            for(int j=0; j<columnas;j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Recorrido espiral de la matriz:");
        recorrerEspiral(matriz, filas, columnas);
        leer.close();
    }
    public static void recorrerEspiral(int[][] matriz, int filas, int columnas) {
        int top=0,left=0,bottom=filas-1,right=columnas-1;
        
        while(top<=bottom && left<=right) {
            for(int i=left;i<=right;i++) {
                System.out.print(matriz[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                System.out.print(matriz[i][right] + " ");
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    System.out.print(matriz[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    System.out.print(matriz[i][left]+" ");
                }
                left++;
            }
        }
    }
}

