package findnumberofcharacters;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class FindNumberofCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("CÜMLEYİ GİRİNİZ: ");
        String b = input.nextLine();
        number_of_a_letter(b);
    }

    private static void number_of_a_letter(String b){
        int sayı = 0 ;
        for (int i = 0 ; i<b.length() ; i++){
            if (b.charAt(i)=='a'){
            sayı ++ ;
        }
    }
        
    System.out.println(sayı);    }
    
}
