package trianglefromsquaresofnumbers;

/**
 *
 * @author ilaydacitak
 */
public class TrianglefromSquaresofNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int a=1;a<=9 ;a++){
           if (a%2!=0){
                for(int j=1; j <= a; j++){
                    if (j*j % 2 !=0 ){
                        System.out.print(j*j+" ") ;
                    }
                }
            System.out.println(" ");
            }
        }
        for ( int b=7 ; b>=1 ; b-- ){
            if (b%2 != 0){
                for (int t=1 ; t<=b ; t++ ){
                    if (t*t % 2!=0) {
                        System.out.print(t*t+" ");
                      
                    }
                }
            System.out.println(" ");
              
            }
        }
    }
    
}
