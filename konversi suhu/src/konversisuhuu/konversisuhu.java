/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhuu;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class konversisuhu {
    public static void main(String[] args){
        //deklarasi
        double celcius, farenheit;
      
        
        //membuat scanner
        Scanner mahal = new Scanner(System.in);
        
        //input
        System.out.println("==koversi suhu==");
        System.out.print("input celcius: ");
        celcius = mahal.nextInt();
        System.out.print("input farenheit: ");
        farenheit = mahal.nextInt();
        
        
        //proses
        farenheit = (1.8 * celcius + 32);
        celcius = ((farenheit - 32) * 5 / 9);
        
        
        //output
        System.out.println("Celcius ke farenheit: " + farenheit);
        System.out.println("farenheit ke celcius: " + celcius);
        
               
        
        
        
    }
    
}
