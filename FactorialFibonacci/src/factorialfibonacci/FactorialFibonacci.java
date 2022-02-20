package factorialfibonacci;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FactorialFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operation = 0 ;
        while (operation != -1 ){
            Scanner input = new Scanner (System.in);
            System.out.println("FAKTÖRİYEL DEĞER HESAPLAMAK İÇİN 1 E BASINIZ");
            System.out.println("FİBONACCİ DEĞERİ HESAPLAMAK İÇİN 2 E BASINIZ");
            System.out.println("ÇIKIŞ İÇİN -1 E BASINIZ");
            operation = input.nextInt();

            if (operation == -1 ){
                System.out.println("BYE BYE");
                System.exit(0);
            }
            else
                switch (operation) {
                    case 1 :
                        System.out.println("FAKTORİYEL İÇİN SAYIYI GİRİNİZ: ");
                        int n = input.nextInt();
                        System.out.println(factorial(n));
                        break ;
                    case 2 :
                        System.out.println("FİBONACCİ İÇİN SAYI GİRİNİZ: ");
                        int x=input.nextInt();
                        System.out.println(fibonacci(x)); 
                        break ; 
                }
        }
    }
    public static int factorial (int n){
        int result = 1 ;
        if ( n == 0  || n == 1 ) {
            return result ;
        }
        else if ( n < 0 ){
        System.out.println("Hatalı giriş");
        return -1 ;
        }
        else {
            while (n>1) {
                  result = n * (n-1) * result ;
                    n = n-2 ;
            }
        }
        return result;
        
    }
    
    public static int fibonacci (int x){
        int x1 = 1 ;
        int x2 = 1 ;
        int result = 0 ;
        for (int i=1 ; i<x-1 ; i++){
            result = x1+x2;
            x1=x2 ;
            x2 = result ;
            
        }
        return result;
        
    
    }
    }
    
