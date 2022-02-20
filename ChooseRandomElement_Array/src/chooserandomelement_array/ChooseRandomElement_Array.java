package chooserandomelement_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class ChooseRandomElement_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3.	Create an array to hold 10 int values entered by the user. 
        Write a java program by defining a method that 
        randomly generate an index and returns the element of this index in the array.*/
        int dizi [] = new int [10];
        for (int i=0 ; i < 10 ; i++ ){
            Scanner input = new Scanner (System.in);
            System.out.println("DİZİYE SAYI GİRİNİZ: ");
            dizi[i]=input.nextInt();
        }
        rastgele_eleman(dizi);
    
    }

    private static void rastgele_eleman(int[] dizi) {
        Random rastgele = new Random();
        int randomkarakter = rastgele.nextInt(dizi.length);
        System.out.println("DİZİDEKİ RANDOM SEÇİLEN KARAKTER: "+randomkarakter);
    }
}
    

