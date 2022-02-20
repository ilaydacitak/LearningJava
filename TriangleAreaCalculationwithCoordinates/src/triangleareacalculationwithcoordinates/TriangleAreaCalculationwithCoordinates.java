package triangleareacalculationwithcoordinates;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class TriangleAreaCalculationwithCoordinates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,y1,x2,y2,x3,y3,area ;
        Scanner input = new Scanner (System.in);
        System.out.println("KORDİNATLARI GİRİN: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        area = (x1*y2+x2*y3+x3*y1-y1*x2-x3*y2-x1*y3) * 1/2 ;
        System.out.println(Math.abs(area));
    }
    
}
