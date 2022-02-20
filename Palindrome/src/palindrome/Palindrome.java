package palindrome;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter string:");
        String txt = input.nextLine();
         
        // Kazak --> kazaK 0,4 - 1,3 - 2,2 ==> len: 5
        // Ece --> ecE 0,2 - 1,1 ==> len: 3
        // Erol --> lorE 0,3 - 1,2 ==> len: 4
        boolean palindrome = true;
        
        for(int i =0; i<txt.length();i++){
            System.out.println(txt.charAt(i));
            System.out.println(txt.charAt(txt.length()-1 - i));
            System.out.println("-----");
            
            if(txt.charAt(i) != txt.charAt(txt.length()-1 - i))
            {
                palindrome = false;
                break;
            }
            
        }
        
        if(palindrome){
            System.out.println("Palindromdur");
        }
        else{
            System.out.println("Değildir.");
        }
    }
    
}
