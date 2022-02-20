package average;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Create an array to hold 10 int values entered by the user.
        Write a java program by defining a method that 
        returns the average of the all elements in the array. */
        int [] dizi = new int [10];
        for (int a = 0 ; a<10 ; a++ ){
            Scanner input = new Scanner ( System.in);
            System.out.println("DİZİYE SAYI GİRİNİZ: ");
            dizi[a] = input.nextInt();
        }
        
        ortalamaları(dizi);
    }
    

    private static void ortalamaları(int[] dizi) {
    
       double toplam = 0;
        for ( int i = 0 ; i<10 ; i++ ){
            toplam += dizi[i];
        }
        System.out.println("asdas:"+toplam/10);
    } 
}
