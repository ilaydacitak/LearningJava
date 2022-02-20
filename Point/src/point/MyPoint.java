/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author hp
 */
public class MyPoint {
   private double x ;
   private double y;
   private int sirasi ;
   
   

    public MyPoint() {
        this.x=0.0;
        this.y=0.0;
        this.sirasi=0;
    }

    public MyPoint(double x, double y, int sirasi) {
        this.x = x;
        this.y = y;
        this.sirasi=sirasi;
    }
    
    public void setX(double x ){
        this.x = x ;
    }
    
    public double getX(){
        return x ;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setSirasi(int sirasi) {
        this.sirasi = sirasi;
    }

    public int getSirasi() {
        return sirasi;
    }
    
    public void MPNOKTASINAMESAFESİ (double x , double y , double mpx , double mpy ){
        System.out.println("ARASINDAKI MESAFE: "+(double) sqrt (pow(mpx-x,2)+pow(mpy-y,2)));;
    }
    
    public void İKİNOKTAARASIUZAKLIK (double x1 , double y1 , double x2 , double y2){
        System.out.println("ARASINDAKI MESAFE : "+(double) sqrt (pow(x2-x1,2)+pow(y2-y1,2)));
    }
    
    static double hesapla(double x1 , double y1 , double x2 , double y2){
        return (double) sqrt (pow(x2-x1,2)+pow(y2-y1,2));
    }
    
    
   
   
   
}
