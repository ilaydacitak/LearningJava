package validorınvalid;

import java.util.Scanner;

/**
 *
 * @author ilaydacitak
 */
public class ValidOrInvalid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("HESAP NUMARANIZI GİRİNİZ: ");
        String hesap_numarasi = input.next();
        int p = hesap_numarasi.length();
       
        // ilk kural 16 tane degilse, direk ele
        if ( p != 16 ){
            System.out.println("EKSİK HESAP NUMARASI!!!");
            System.exit(0);
        }
       
        // ikinci kural hepsini buyuk harfe cevir
        String hesap_numarasi_upper = hesap_numarasi.toUpperCase();
       
        // ucuncu kural ilk harf ikinci harften once gelmesi lazim
        char ilk_harf = hesap_numarasi_upper.charAt(0);
        char ikinci_harf = hesap_numarasi_upper.charAt(1);
       
        int ilk_harf_ascii = ilk_harf ;
        int  ikinci_harf_ascii = ikinci_harf ;
                
        if (ikinci_harf_ascii<ilk_harf_ascii){
            System.out.println("HATALI");
            System.exit(0);
        }
       
       
        // dorduncu kural; asal sayı olmalı 
        String ucvedort = hesap_numarasi_upper.substring(2,4);
        int ucvedort_sayi = Integer.parseInt(ucvedort);
        for (int t=2 ; t<ucvedort_sayi ; t ++ ){
            if (ucvedort_sayi%t == 0 ){
                System.out.println("HATA");
                System.exit(0);
            }
            else {
                // devam...
            } 
        }
      
        // once bu elemanlari diziye atacagiz
        //AC11576018412626
        int rakamlar[]  = new int[12];
        for(int i=0; i<12; i++){
            char c = hesap_numarasi_upper.charAt(i+4);
            int r = Integer.parseInt(String.valueOf(c));
            rakamlar[i] = r;
        }

        // cift elemanlari carp ve t
        int cift_toplam = 0;
        for(int i =0; i<12; i++)
        {
            if(i % 2 == 0)
            {
                int w = rakamlar[i];
                int w2 = w * 2;

                if(w2 >= 10)
                {
                    cift_toplam += 1;
                    cift_toplam += (w2 %  10 );
                }
                else
                {
                    cift_toplam += w2;
                }

            }
        }

        // tekleri topla
        int tek_toplam = 0;
        for(int i =0; i<12; i++) {
            if (i%2 != 0){
                int q = rakamlar[i] ;
                tek_toplam += q;
            }
        }

        int genel_toplam = cift_toplam + tek_toplam;

        if(genel_toplam % 10 == 0)
        {
            System.out.println("Valid!..");
        }
        else{
            System.out.println("Invalid!..");
        }
    }
    
}
