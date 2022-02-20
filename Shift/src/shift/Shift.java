package shift;

import java.util.Arrays;

/**
 *
 * @author ilaydacitak
 */
public class Shift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Create an array to hold 10 int values randomly.
        Write a java program by defining a method that
        swap the values of the first element and the last element in the array */
        int [] dizi = new int [10];
        for (int i =0 ; i<10 ; i++) {
            dizi[i]=(int)(Math.random()*100);
        }
        System.out.println("random dizi: "+Arrays.toString(dizi));
        karistirmaca1(dizi);
   
    }

    private static void karistirmaca1(int[] dizi) {
        int a = dizi[0];
        dizi[0]= dizi[dizi.length-1];
        dizi[dizi.length-1]=a;
        System.out.println("yeni dizi: "+Arrays.toString(dizi));
        
    }
    
    
}
