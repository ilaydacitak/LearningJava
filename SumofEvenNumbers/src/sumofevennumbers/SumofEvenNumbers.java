package sumofevennumbers;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class SumofEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("SAYI GİRİNİZ: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        çiftlerin_toplamı(a,b,c,d,e); 
                     
    }

    private static void çiftlerin_toplamı(int a,int b,int c,int d,int e){
        int sum = 0;
        
        if (a % 2  == 0) {
            sum +=a ;
        }
         else {
                 
          }
        if (b % 2 == 0 ) {
            sum += b ;
        }
        else {
        
        }
        if (c % 2 == 0) {
            sum += c ;
        }
        else {
        }
        if (d % 2 == 0 ) {
        sum += d;
        }
        else {
            
        }
        if (e % 2 == 0 ){
            sum += e;
        }
        else {
            
        }
        System.out.println("çiftlerin toplamı : "+sum);
   

    }
    
    
}
