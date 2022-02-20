package findminvalue;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindMinValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("SAYILAR GİRİNİZ: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
       
        girilen_sayılardaki_en_küçügü (a,b,c);
               
    }

    private static void girilen_sayılardaki_en_küçügü(int a,int b,int c) {
        if (a<b && a<c ) {
            System.out.println("MİN SAYI: "+a);
        }
        else if (b<a && b<c ){
            System.out.println("MİN SAYI: "+b);
        }
        else {
            System.out.println("MİN SAYI: "+c);
        }
    }
    
}
