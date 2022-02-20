package numberofevenandodd_array;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class NumberofEvenandOdd_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create an array to hold 10 int values entered by the user. 
        Write a java program by defining a method that
        display the number of even numbers and odd numbers */
        
        int [] dizi = new int [10];
        for ( int i =0 ; i<10 ; i++){
            Scanner input = new Scanner ( System.in );
            System.out.println("DİZİYE ELEMAN GİRİNİZ: ");
            dizi[i] = input.nextInt();
        }
        çift_ve_tek_sayıların_sayısı(dizi);
    }

    private static void çift_ve_tek_sayıların_sayısı(int[] dizi) {
        int tek_sayıların_sayısı = 0;
        int çift_sayıların_sayısı = 0;
        
        for ( int a = 0 ; a<10 ; a++){
            if (dizi[a]%2 == 0){
                çift_sayıların_sayısı ++ ;
           }
            else {
                tek_sayıların_sayısı ++ ;
            }
        }
        System.out.println("TEK SAYILARIN SAYISI: "+tek_sayıların_sayısı);
        System.out.println("ÇİFT SAYILARIN SAYISI: "+çift_sayıların_sayısı);
        
        
        
    
    }
    
}
