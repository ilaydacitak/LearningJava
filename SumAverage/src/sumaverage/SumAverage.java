package sumaverage;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class SumAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("DEĞER GİRİNİZ: ");
        int sum = 0 ;
        int count =0 ;
        int number = input.nextInt();
        while ( number != -1){
            if(number%10 !=0 ){
                sum += number ;
                count +=1 ;
                if (sum>100){
                    break;
                }
            }
            number = input.nextInt();
        }
        System.out.println(sum);
        int average = sum/(count);
        System.out.println(average);
    }
}
