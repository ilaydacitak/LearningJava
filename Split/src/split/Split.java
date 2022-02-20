package split;

/**
 *
 * @author ilaydacitak
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "abcdefghıjklmnoprstuvwxyz" ;
        int split_number = 5;
        int string_size = a.length();
        int part_size ;
     
        System.out.println(a);
        part_size = string_size / split_number ;
        for (int i=0 ; i<string_size ;i++ ){
            if( i%part_size == 0 ) {
                System.out.println();
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
    }
    
}
