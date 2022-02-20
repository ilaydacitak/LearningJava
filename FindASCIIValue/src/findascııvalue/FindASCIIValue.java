package findascııvalue;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindASCIIValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a ;
        Scanner input = new Scanner ( System.in);
        System.out.println("CÜMLEYİ GİRİNİZ: ");
        a = input.nextLine();
        int asciiValue = 0;
        int i;
        for (i=0 ; i<a.length(); i++){
            if(a.charAt(i) !=' ') {
                asciiValue+=a.charAt(i);
                System.out.print(a.charAt(i));
            }
            else {
                System.out.println(" "+asciiValue);
                asciiValue=0;
            }
        } 
        System.out.println(" "+asciiValue);
    }
    
}
