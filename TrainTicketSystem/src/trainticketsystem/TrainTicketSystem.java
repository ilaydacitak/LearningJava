/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trainticketsystem;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class TrainTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] tren = new int [3][3] ;
            for (int i=0 ; i<tren.length ; i++){
                for (int a=0 ; a<tren[i].length ; a++){
                    tren[i][a] = 0 ;
                }
            }
            
        String [][] bilgi = new String [3][3] ;
        
        int secim = 0 ;
        while (secim != -1){
            
            
            Scanner input1 = new Scanner (System.in);
            System.out.println("BİLET ALMAKİÇİN 1e,BİLET İADE İÇİN 2ye,KULLANICI BİLGİLERİNİ GÖRMEK İÇİN 3e,ÇIKIŞ İÇİN -1e BASINIZ");
            secim = input1.nextInt();
            
            if (secim == 1 ){
                boolean bulundu = false;
                
                Scanner input2 = new Scanner (System.in);
                System.out.println("ADINIZI,SOYADINIZI,YAŞINIZI VE CINSIYETİNİZİ GİRİNİZ: ");
                String bilet_alma = input2.next();
                for(int t=0 ; t<tren.length ; t++){
                    for (int y=0 ; y<tren[t].length ; y++ ){
                        if (tren[t][y]==0){
                            tren[t][y] = 1 ;
                            System.out.println("VAGON NUMARANIZ: "+(t+1)+" KOLTUK NUMARANIZ: "+(y+1));
                            bilgi [t][y] = bilet_alma ; 
                            
                            bulundu = true;
                            
                            break;
                        }
                    }
                    if(bulundu){
                        break;
                   }                   
                }
                    if(bulundu==false){
                        System.out.println("YER YOK!");
                 }
                
            }     
            
            else if ( secim == 2 ){
                Scanner input3 = new Scanner (System.in);
                System.out.println("VAGON NUMARANIZINI GİRİNİZ: ");
                int vagon= input3.nextInt();
                System.out.println("KOLTUK NUMARASINI GİRİNİZ: ");
                int koltuk = input3.nextInt();
                    if (tren[vagon-1][koltuk-1]==1){
                        tren[vagon-1][koltuk-1]=0;
                        bilgi[vagon-1][koltuk-1] = "";
                        System.out.println("KAYDINIZ SİLİNMİŞTİR!");
                        
                    }
                    else{
                        System.out.println("BÖYLE BİR KAYIT YOKTUR.HATALI GİRİŞ!");
                    }
            } 
            
            else if (secim == 3) {
                Scanner input4 = new Scanner ( System.in) ;
                System.out.println("VAGON NUMARANIZI GİRİNİZ: ");
                int vagon_numarası = input4.nextInt();
                System.out.println("KOLTUK NUMARANIZI GİRİNİZ: ");
                int koltuk_numarası = input4.nextInt() ;
                    if (tren[vagon_numarası-1][koltuk_numarası-1]!=0){
                        System.out.println("KULLANICI BİLGİLERİ: "+bilgi[vagon_numarası-1][koltuk_numarası-1]);
                    }
                    else if (tren[vagon_numarası-1][koltuk_numarası-1]==0){
                        System.out.println("BU KOLTUK BOŞTUR!");
                    }
            }
      
        }//While son parantez
    }
    
    public static int[] bos_koltugu_ver(int[][] tren){
        int t=-1 ;
        int y=-1 ;
        
        boolean bulundu = false;
                
        for(t=0 ; t<tren.length ; t++){
            for (y=0 ; y<tren[t].length ; y++ ){
                if (tren[t][y]==0){
                    //tren[t][y] = 1 ;
                    bulundu = true;
                    break;
                }
                
            }
        if(bulundu){
                    break;
                }
        }
        
        
     return new int[] {t,y};
    }
    
}
