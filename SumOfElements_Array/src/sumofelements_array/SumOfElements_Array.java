/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofelements_array;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class SumOfElements_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1.Create an array to hold 10 int values entered by the user.
        Write a java program by defining a method that returns the sum of the all elements in the array */
        int dizi [] = new int [10];
        for (int a=0 ; a < 10 ; a++ ) { 
            Scanner input = new Scanner(System.in);
            System.out.println("DİZİYE SAYI GİRİNİZ: ");
            dizi[a]= input.nextInt();
            on_karakterin_toplamı(dizi);  
        }
    }

    private static void on_karakterin_toplamı(int[] dizi) {
        int top = 0 ;
        for (int i = 0 ; i <10 ; i++){
            top += dizi[i] ;
        }
        System.out.println("toplam: "+top);
        
    } 
    
    
    
}
