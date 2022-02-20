package findnegativevalues;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindNegativeValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Create an array to hold 10 int values entered by the user.
        Write a java program by defining a method that 
        displays the negative elements in the array. */
        
        int [] dizi = new int [10];
        for (int i= 0 ; i<10 ; i++ ){
            Scanner input = new Scanner(System.in);
            System.out.println("DİZİYE DEĞER GİRİNİZ: ");
            dizi[i]=input.nextInt();
        }
        negatifleri_yazdırma(dizi);
        
    }

    private static void negatifleri_yazdırma(int[] dizi) {
       for (int a = 0 ; a<10 ; a++){
            if (dizi[a]<0){
               System.out.println("negatif değer: "+dizi[a]);
            }
        }
    
    }
    
}
