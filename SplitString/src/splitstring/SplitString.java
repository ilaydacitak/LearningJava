package splitstring;

/**
 *
 * @author mrsci
 */
public class SplitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "05364701913 İLAYDA ÇITAK" ;
        System.out.println("NUMARA İSİM SOYISIM:05364701913 İLAYDA ÇITAK");
        System.out.println("NUMARANIZ: "+a.substring(0,10)); 
        System.out.println("İSMİNİZ VE SOYİSMİNİZ: "+a.substring(12));
        char rand1 = (char) ((Math.random()*26)+65);
        char rand2 = (char)(( Math.random()*26)+65);
        char rand3 = (char) ((Math.random()*26)+65); 
        String b = "İLAYDA ÇITAK"+rand1+rand2+rand3;
        System.out.println(b);
        System.out.println(b.toLowerCase());
    }
    
}
