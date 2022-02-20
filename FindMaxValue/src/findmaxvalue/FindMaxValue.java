package findmaxvalue;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindMaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );
        System.out.println("3TANE SAYI GİRİNİZ: ");
        int a = input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();      
        en_büyük_sayı(a,b,c); 
    }
    
    private static void en_büyük_sayı(int a, int b, int c) {
        if (a>b && a>c){
           System.out.println("EN BÜYÜK SAYI: "+a);
        }
        else if (b>c && b>a){
           System.out.println("EN BÜYÜK SAYI: "+b);
        }
        else {
           System.out.println("EN  BÜYÜK SAYI: "+c);
        }
    }
}
    

