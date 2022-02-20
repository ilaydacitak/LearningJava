package findmaximumvalue;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindMaximumValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x , y , max ;
        Scanner input = new Scanner (System.in);
        System.out.println("X DEĞERİNİ GİRİNİZ: ");
        x = input.nextInt();
        System.out.println("Y DEĞERİNİ GİRİN: ");
        y = input.nextInt();
            if (x>y){
                System.out.println("max=x") ;
            }
            else if (x<y) {
                System.out.println("max=y");
            }
            else {
                System.out.println("X İLE Y EŞİTTİR");
            } 
    }
    
}
