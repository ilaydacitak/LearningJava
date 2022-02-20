package findmax_array;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindMax_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 9.	Create an array to hold 10 int values entered by the user. 
        Write a java program by defining a method that
        returns the maksimum element in the array.*/
        
        int [] dizi = new int [10];
        for (int a = 0 ; a<10 ; a++){
            Scanner input = new Scanner (System.in);
            System.out.println("DİZİYE ELEMAN GİRİNİZ: ");
            dizi[a] = input.nextInt();
        }
        
        dizideki_en_büyük_eleman(dizi);
       
    
    }

    private static void dizideki_en_büyük_eleman(int[] dizi) {
        int max = dizi[0];
        for ( int i = 1 ; i<10 ; i++){
            if (dizi[i]>max){
               max = dizi[i];
            }
        }
        System.out.println("MAX ELEMAN: "+max);
    }
  
}
