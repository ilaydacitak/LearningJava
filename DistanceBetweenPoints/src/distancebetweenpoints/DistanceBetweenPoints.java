package distancebetweenpoints;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class DistanceBetweenPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("NOKTALARIN KORDİNATLARINI GİRİNİZ: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("x1,y1: "+x1+","+y1);
        System.out.println("x2,y2: "+x2+","+y2);
        double a = (Math.pow((Math.abs(x2-x1)),2));
        double b = (Math.pow((Math.abs(y2-y1)),2));
        double c = a+b ;
        double uzaklık = (Math.sqrt(c));
        System.out.println(uzaklık);
    }
    
}
