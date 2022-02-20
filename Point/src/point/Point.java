/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package point;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class Point {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<MyPoint> mp = new ArrayList<MyPoint>();
        MyPoint mypoint = new MyPoint();
        
        int secim = -1 ;
        while(secim!=0){
        
        Scanner inputtt = new Scanner (System.in);   
        System.out.println("YENİ MP EKLEMEK İÇİN 1 , GİRECEGİNİZ NOKTA İLE MP NOKTASI ARASI MESAFE HESAPLAMAK İÇİN 2 , "
                + "BAŞKA BİR NOKTAYLA OLAN MESAFESİNİ HESAPLAMAK İÇİN 3 ,"
                + "İKİ MP NOKTASI ARASI UZAKLIGI HESAPLAMAK İÇİN 4 , ÇIKIŞ İÇİN 0 ");
        secim = inputtt.nextInt();
        
        if(secim==1){
            Scanner inputt= new Scanner (System.in);
            System.out.println("KENDİ NOKTANIZI OLUŞTURUN: ");
            System.out.print("X DEĞERİNİ GİRİNİZ: ");
            double mpx = inputt.nextDouble();
            System.out.print("Y DEĞERİNİ GİRİNİZ: ");
            double mpy = inputt.nextDouble();

            int sirasi = mp.size()+1;
            System.out.println("SIRASI: "+sirasi);

             MyPoint mpxy = new MyPoint(mpx, mpy , sirasi );
                mp.add(mpxy);
        }    
        
        if(secim==2){
            System.out.println("X DEĞERİ GİRİN: ");
            double x1 = inputtt.nextDouble();
            System.out.println("Y DEĞERİ GİRİN: ");
            double y1 = inputtt.nextDouble();
            System.out.println("KAÇ NUMARALI MP NOKTASINI SEÇİYORSUNUZ: ");
            int secilenMpNoktasiSirasi = inputtt.nextInt();
            
            
            for(int i =0 ; i<mp.size() ; i++){
                if(mp.get(i).getSirasi()  == secilenMpNoktasiSirasi){
                    
                    
                    mypoint.MPNOKTASINAMESAFESİ(x1 , y1 , mp.get(i).getX() , mp.get(i).getY() );
                    
                    
                }
            }
        }
        if(secim==3){
            System.out.print("X1 DEĞERİNİ GİRİNİZ: ");
            double x1 = inputtt.nextDouble();
            System.out.println("Y1 DEĞERİNİ GİRİNİZ: ");
            double y1 = inputtt.nextDouble();
            System.out.print("X2 DEĞERİNİ GİRİNİZ: ");
            double x2 = inputtt.nextDouble();
            System.out.println("Y2 DEĞERİNİ GİRİNİZ: ");
            double y2 = inputtt.nextDouble();
            
            mypoint.İKİNOKTAARASIUZAKLIK(x1, y1, x2, y2);
        }
        if(secim==4){
            Scanner inpu = new Scanner (System.in);
            System.out.println("1.MP NOKTASININ SIRASINI GİRİNİZ: ");
            int birinciSira = inpu.nextInt();
            System.out.println("2.MP NOKTASININ SIRASIBNI GİRİNİZ: ");
            int ikinciSira = inpu.nextInt();
            
            for(int i =0 ; i<mp.size() ; i++){
                if(mp.get(i).getSirasi()  == birinciSira){
                    double X1MP = mp .get(i).getX() ;
                    double Y1MP = mp .get(i).getY();
                        for(int a =0 ; a<mp.size() ; a++){
                            if(mp.get(a).getSirasi()  == ikinciSira){
                                double X2MP = mp .get(a).getX() ;
                                double Y2MP = mp .get(a).getY();
                                
                                 System.out.println("ARASINDAKİ MESAFE: "+MyPoint.hesapla(X1MP , Y1MP , X2MP , Y2MP));
                            }
                        }
                }
            }
  
        }
        if(secim==0){
            System.out.println("ÇIKIŞ YAPILIYOR...");
            System.exit(0);
        
        }
        }
    }
    
}
