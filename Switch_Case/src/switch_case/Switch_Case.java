/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_case;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class Switch_Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Generate two number: the first one must be between -1 and -100 (negative),
        the second number must be between 1 and 100 (positive)*/
        
        int num1 = -1 - (int)(Math.random()*9);
        int num2 = 1 + (int)(Math.random()*9);
        System.out.println(num1);
        System.out.println(num2);
        int c;
        int sayı_sayısı = 0;
        /*Let the user choose the case operation he wants to perform. (use the switch-case structure)
          1. Display positive and negative numbers between these two numbers, and find the
        sum of positive numbers and the sum of negative numbers. 
          2. Display the squares of negative odd numbers and the square roots of positive even numbers.
          3.Calculate the average of the numbers which are between two random numbers.
        If the average is less than 0, recalculate the average by taking the absolute 
        value of negative numbers. If the average is greater than 0, calculate only the average of
        positive numbers. If the average is equal to 0, print the average of the numbers.
          4.Check the numbers which are between two random numbers are cube or not.*/
        
         /*Ask the user if he want to perform again before exiting the program. */
        do {
        
            Scanner input3 = new Scanner( System.in);
            System.out.println("enter the process: ");
            int x = input3.nextInt();
            int total_sum = 0 ;
            int sum_negatif = 0 ;
            int sum_pozitif = 0 ;
            switch (x){
                case 1 :
                    while(num1<0){
                        sum_negatif += num1 ;
                        num1 ++ ;
                    }
                    System.out.println("negatiflerin toplamı: "+sum_negatif);

                    while(num2 >0) {
                        sum_pozitif += num2 ;
                        num2 --;
                    }
                    System.out.println("pozitif sayilarin toplami: "+sum_pozitif);
                    break;
                case 2 :
                    while (num1 <0){
                        if (num1 % 2 == -1)
                            System.out.println("negatif ve tek olan sayının karesi :"+num1*num1);
                            num1++;
                    }
                    while (num2 >0){
                        if(num2 % 2 == 0)
                            System.out.println("pozitif ve çift olan sayının karekoku: "+Math.sqrt(num2));
                            num2--;
                    } 
                    break;
                case 3 : 
                    int tempNum1 = num1 ;
                    while(num1<=num2){
                        total_sum += num1 ;
                        sayı_sayısı ++ ;
                        num1++;
                    }

                    int average = (total_sum)/(sayı_sayısı);
                    System.out.println("Average: "+average);
                    if ( average <0 ) {
                        total_sum = 0 ;
                        while (tempNum1<0){
                            total_sum += Math.abs(tempNum1);
                            tempNum1 ++ ;
                        }
                        System.out.println("Average:"+total_sum/ (sayı_sayısı) ); 
                    }
                    else if ( average == 0) {
                        System.out.println("Average: "+average);
                    }
                    else  {
                        total_sum = 0 ;
                        int pozitif_sayı_sayısı = 0 ;
                        while(num2>0){
                            total_sum += num2 ;
                            pozitif_sayı_sayısı ++ ;
                            num2 -- ;
                        }
                        System.out.println("Average: "+total_sum/(pozitif_sayı_sayısı));
                    }
                    break ;
                case 4 :
                    while ( num1 <= num2) {
                        int n = (int)Math.pow(Math.abs(num1),1.0/3.0);
                        if(Math.abs(num1)== n*n*n){
                            System.out.println(num1+" "+n+"nin küpüdür.");
                            num1++;
                        }
                    }
                    break ;
                    default :
                    System.out.println("NO PROCES");
                    }
                    Scanner input5 = new Scanner (System.in) ;
                    System.out.println("DEVAM ETMEK İSTERN MİSİNİZ ? EVET(1) HAYIR (0)");
                    c = input5.nextInt() ;
        }
        while(c==1);
            System.out.println("BYE");
    }
    
}
