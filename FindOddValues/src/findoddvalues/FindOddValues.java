package findoddvalues;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindOddValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 8.	Create an array to hold 10 int values entered by the user.
        Write a java program by defining a method that
        returns the odd elements in the array. */
          
        int [] dizi = new int [10];
        for (int a = 0 ; a<10 ; a++){
            Scanner input = new Scanner (System.in);
            System.out.println("DİZİYE ELEMAN GİRİNİZ: ");
            dizi[a] = input.nextInt();
        }
        tek_elemanları(dizi);
    }

    private static void tek_elemanları(int[] dizi) {
        for (int i = 0 ; i<10 ; i++){
            if (dizi[i]%2 != 0){
            System.out.println("TEK ELEMAN: "+dizi[i]);
            }
        }
    }
}
