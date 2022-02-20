package minelement_array;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class MinElement_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dizi [] = new int [10];
        for (int a=0 ; a < 10 ; a++ ) { 
            Scanner input = new Scanner(System.in);
            System.out.println("DİZİYE SAYI GİRİNİZ: ");
            dizi[a]= input.nextInt();
            dizinin_minimum_elemanı (dizi);

        }
    }

    private static void dizinin_minimum_elemanı(int[] dizi) {
        int dizinin_minimum_elemanı = dizi[0];
            for (int a=1 ; a <dizi.length ; a++ ){
                if(dizi[a]< dizinin_minimum_elemanı) {
                    dizinin_minimum_elemanı = dizi [a] ;
                }
            }
        System.out.println("min eleman: "+dizinin_minimum_elemanı);
        
    }
    
    
}
