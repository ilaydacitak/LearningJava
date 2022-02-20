package sumofsquares;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class SumofSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner ( System.in ) ;
        System.out.println("SAYILARI GİRİNİZ: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        
        sayiların_karelerinin_toplamı(a,b,c,d,e);
    }

    private static void sayiların_karelerinin_toplamı(int a, int b, int c, int d, int e) {
       int sum = 0 ;
       sum += a*a ;
       sum += b*b ;
       sum += c*c ;
       sum += d*d ;
       sum += e*e ;
       
    
       System.out.println("TOPLAM: "+sum);
        
    }
}
    

