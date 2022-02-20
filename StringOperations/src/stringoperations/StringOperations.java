package stringoperations;

/**
 *
 * @author ilaydacitak
 */
public class StringOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "The deadline for Introduction to Programming Project1 is December 20, 2019.";
        //1.SEÇENEK
        
        int k=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ')
                    k++;
            }
        System.out.println("cümledeki kelime sayısı="+(k+1));
        
        //2.SEÇENEK //
        int boşluk_sayısı = 0;
        int rakam_sayisi = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                boşluk_sayısı ++ ;
            } 
            else if(Character.isDigit(s.charAt(i))){
                rakam_sayisi += 1;
            }
        }
        int karekter_sayısı = s.length();
        int a = karekter_sayısı-boşluk_sayısı;
        int d = a-rakam_sayisi;
        
        System.out.println("karekter sayısı: "+d);
        
        //3.SEÇENEK
        
        System.out.println("rakam sayısı: "+rakam_sayisi);
        
        //4.SEÇENEK
        
        for(int i=0;i<s.length()-1;i++){
       
            char karakter = s.charAt(i);
            boolean tekrar_yapmaz = true;
            
            for(int j=i+1; j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    // bu demek ki tekrarliyor
                    tekrar_yapmaz = false;
                    break;
                }          
                else{
                    // tekrarlamiyor
                    continue;
                }
            }
            
            // tekrar_yapmaz true is bunu yazdir
            if(tekrar_yapmaz == true){
                System.out.println("Tekrarlamayan ilk karakter: "+ karakter);
                break;
            }
            else if(tekrar_yapmaz == false){
                // bu karakter tekrar yapmistir
                // diger karaktere gec
            }
        }
        
         //5.SEÇENEK
        char karakter = 'o' ;
        int tane  = 0 ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==karakter){
                tane ++ ; }
        }
        System.out.println(tane);
    }
    
}
