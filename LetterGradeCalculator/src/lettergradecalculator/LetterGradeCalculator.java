package lettergradecalculator;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class LetterGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int midterm , quız , classnote , fınal ;
        Scanner input = new Scanner(System.in);
        System.out.println("SIRAYLA QUIZ,MİDTERM VE FINAL NOTLARINI GİRİNİZ: ");
        midterm = input.nextInt ();
        quız = input.nextInt();
        fınal = input.nextInt();
        classnote = (int)( Math.random()*10 );
        int overall ;
        overall = (int) ((int) (quız*(0.15))+(midterm*(0.25))+(fınal*(0.5))+classnote);
        System.out.println(overall);
        if (overall>84){
        System.out.println("A");
        }
        else if (overall>69) {
            System.out.println("B");
        }
        else if (overall>54) {
            System.out.println("C");
        }
        else {
           System.out.println("F");
        }
    }
    
}
