package timeconverter;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saniye ;
        int dakika ;
        Scanner input = new Scanner (System.in);
        System.out.println("SANİYEYİ GİRİNİZ: ");
        saniye = input.nextInt();
            for (dakika=0 ; saniye>=60 ; saniye-=60 )   {
                dakika++ ;
            }
            int saat = 0;
            while (dakika>=60){
                saat++ ;
                dakika -=60 ;
            }
        System.out.println("saat: "+saat+"dakika: "+dakika+"saniye: "+saniye);
    }
}
