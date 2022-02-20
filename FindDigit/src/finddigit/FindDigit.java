package finddigit;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner ( System.in);
            System.out.println("BİR CÜMLE GİRİNİZ: ");
            String s = input.nextLine();

            rakam_sayısı(s);
    }

    private static void rakam_sayısı(String s) {
        int rakam_sayisi = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                rakam_sayisi += 1;
            }
            else {
                
            }
        }

        System.out.println("rakam sayısı: "+rakam_sayisi);


    }


}
