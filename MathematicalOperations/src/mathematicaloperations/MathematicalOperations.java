package mathematicaloperations;

/**
 *
 * @author ilaydacitak
 */
public class MathematicalOperations {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Math.cos(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(100)));
        System.out.println(Math.cos(Math.toRadians(165)));
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.sin(Math.toRadians(100)));
        System.out.println(Math.sin(Math.toRadians(165)));
        
        double x = (Math.exp(2));
        double y = (Math.log(5));
        double z = (Math.log10(10000));
        double t = (Math.pow(3,8));
        double q = (Math.sqrt(45));
        
        System.out.println(Math.ceil(x));
        System.out.println(Math.round(y));
        System.out.println(Math.rint(z));
        System.out.println(Math.floor(t));
        System.out.println(Math.rint(q));
    }
    
}
