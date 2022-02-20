/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int banka [] = new int [100];
        for (int i=0 ; i<banka.length ; i++){
            banka[i]=0;
        }
        
        String [] bilgi = new String [100];
        int ıd_numarası [] = new int [100];
        int [] tl_hesabı = new int [100];
        int [] euro_hesabı = new int [100];
        
               
        int secim = 0 ;
        while (secim != -1){
        Scanner input = new Scanner (System.in);
        System.out.println("MÜŞTERİ EKLEMEK İÇİN 1e , MÜŞTERİ ÇIKARMAK İÇİN 2ye , MÜŞTERİ HİZMETELERİ İÇİN 3e , ÇIKIŞ İÇİN -1e BASINIZ");
        secim = input.nextInt();
        
        
            if (secim==1){
                
            boolean bulundu = false;
                
            Scanner input1 = new Scanner (System.in);
            System.out.println("ADINIZI,SOYADINIZI,YAŞINIZI VE CINSIYETİNİZİ GİRİNİZ: ");
            String kayıt = input1.next();
            
                for(int t=0 ; t<banka.length ; t++){
                    if (banka[t]==0){
                        banka[t]=1;
                        bilgi[t]=kayıt ;
                        tl_hesabı[t]=0;
                        euro_hesabı[t]=0;
                        System.out.println("TL:"+tl_hesabı[t]);
                        System.out.println("EURO:"+euro_hesabı[t]);
                        int ıd = t+1000;
                        ıd_numarası[t]=ıd ;
                        System.out.println("SİZE BİR ID NUMARASI VERİLECEKTİR.BU NUMARA İLE SİSTEME GİRİŞ YAPABİLECEKSİNİZ!");    
                        System.out.println("ID NUMARANIZ:"+ıd); 
                        
                        bulundu=true;
                        break;
                    }
                    
                    
                   
                }
            
            }
            
            if (secim==2){
                Scanner input1 = new Scanner (System.in);
                System.out.println("SİLMEK İSTEDİĞİNİZ HESABIN ID NUMARASINI GİRİNİZ:");
                int girilen_ıd_numarası = input1.nextInt();
                for(int a =0 ; a<ıd_numarası.length ;a++){
                    if (banka[a]==1 && ıd_numarası[a]==girilen_ıd_numarası){
                        System.out.println("SİLECEGİNİZ KİŞİ:"+bilgi[a]);
                        banka[a]=0;
                        
                        System.out.println("HESABINIZDAKI TL:"+tl_hesabı[a]);
                        if(tl_hesabı[a]<0){
                            System.out.println("TL BORCUNUZ:"+tl_hesabı[a]);
                            tl_hesabı[a]=0;
                        }
                        else{
                            System.out.println("KALAN TL HESABINI ÇEKİNİZ");
                            tl_hesabı[a]=0;
                        }
                        System.out.println("HESABINIZDAKI EURO:"+euro_hesabı[a]);
                        if(euro_hesabı[a]<0){
                            System.out.println("EURO BORCUNUZ:"+euro_hesabı[a]);
                            euro_hesabı[a]=0;
                        }
                        else{
                            System.out.println("KALAN EURO HESABINIZI ÇEKİNİZ");
                            euro_hesabı[a]=0;
                        }
                        System.out.println("KİŞİ SİLİNMİŞTİR!");
                    break; 
                    }
                    else{
                        System.out.println("YANLIŞ ID NUMARASI GİRDİNİZ!");
                        break;
                    }
                }
            }
            
            if (secim==3){
                Scanner input1 = new Scanner(System.in);
                System.out.println("İŞLEM YAPMAK İSTEDİĞİNİZ HESABIN ID NUMARASINI GİRİNİZ:");
                int girilen_ıd_numarası = input1.nextInt();
                for(int e =0 ; e<ıd_numarası.length ;e++){
                    if (banka[e]==1 && ıd_numarası[e]==girilen_ıd_numarası){
                        System.out.println("İŞLEM YAPACAGINIZ HESABA AİT BİLGİLER:"+bilgi[e]);
                        System.out.println("TL:"+tl_hesabı[e]);
                        System.out.println("EURO:"+euro_hesabı[e]);
                        System.out.println("HESABINIZA PARA EKLEMEK İÇİN 1 , ÇEKMEK İÇİN 2 , TÜM PARANIZI TL CİNSİNDEN GÖRMEK İÇİN 3e BASINIZ");
                    }
                    else{
                        System.out.println("YANLIŞ ID NUMARASI GİRDİNİZ!");
                        break;
                    }
                Scanner input2 = new Scanner(System.in);
                int para_islemi = input2.nextInt();
                    if (para_islemi==1){
                        Scanner input3= new Scanner(System.in);
                        System.out.println("TL İÇİN 1 , EURO İÇİN 2ye BASINIZ");
                        int para_turu = input3.nextInt();
                            if(para_turu==1){
                                Scanner input4 = new Scanner(System.in);
                                System.out.println("EKLEMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
                                int eklenen_tl = input4.nextInt();
                                tl_hesabı[e]= tl_hesabı[e]+eklenen_tl;
                                System.out.println("YENİ TL MİKTARINIZ: "+tl_hesabı[e]);
                                break;
                            }
                            if (para_turu==2){
                                Scanner input5 = new Scanner(System.in);
                                System.out.println("EKLEMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
                                int eklenen_euro = input5.nextInt();
                                euro_hesabı[e]= euro_hesabı[e]+eklenen_euro;
                                System.out.println("YENİ EURO MİKTARINIZ: "+euro_hesabı[e]);
                                break;
                                
                            }
                    }
                    if(para_islemi==2){
                        Scanner input3= new Scanner(System.in);
                        System.out.println("TL İÇİN 1 , EURO İÇİN 2ye BASINIZ");
                        int para_turu = input3.nextInt();
                            if(para_turu==1){
                                Scanner input6 = new Scanner(System.in);
                                System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
                                int çekilen_tl = input6.nextInt();
                                tl_hesabı[e] = tl_hesabı[e]-çekilen_tl;
                                System.out.println("YENİ TL MİKTARINIZ: "+tl_hesabı[e]);
                                break;
                                
                            }
                            
                            if (para_turu==2){
                                Scanner input7 = new Scanner(System.in);
                                System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
                                int çekilen_euro = input7.nextInt();
                                euro_hesabı[e]= euro_hesabı[e]-çekilen_euro;
                                System.out.println("YENİ EURO MİKTARINIZ: "+euro_hesabı[e]);
                                break;
                        
                            }
                    }
                    if(para_islemi==3){
                        int tl_ederi = euro_hesabı[e]*6;
                        System.out.println("EURO HESABINIZIN TL CİNSİNDEN EDERİ:"+tl_ederi);
                        System.out.println("TÜM PARANIZIN TL CİNSİNDEN EDERİ:"+(tl_ederi+tl_hesabı[e]));
                        break;
                        
                    }
                }
            }
                
                    
    }
    }
    
}
