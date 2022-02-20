package commonelements;

/**
 *
 * @author ilaydacitak
 */
public class CommonElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] ilk_dizi = {1,2,3} ;
        double [] ikinci_dizi = {55,5,3} ;
        ortak_elemanlar(ilk_dizi,ikinci_dizi);
    }

    private static void ortak_elemanlar(double[] ilk_dizi, double[] ikinci_dizi) {
        for (int i =0 ; i<ilk_dizi.length ; i++ ){
            for ( int j = 0 ; j < ikinci_dizi.length ; j++ ) {
                if (ilk_dizi[i]==ikinci_dizi[j]){
                    System.out.println("ORTAK ELEMANLAR: "+ilk_dizi [i]);
                }
            }
        } 
    }
}
    

