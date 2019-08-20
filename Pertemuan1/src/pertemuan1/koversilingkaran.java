/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class koversilingkaran {
    public static void main(String[] args){
        //deklarasi
        double luas, pi = 3.14;
        int r;
        
       
        
        //scanner baru
        Scanner mahal = new Scanner(System.in);
        
        //input
        System.out.println("== menghitung luas lingkaran ");
        System.out.print("input r: ");
        r =  mahal.nextInt();

        
        //proses
        luas = pi * r * r;
        
        //output
        System.out.println("Luas: " + luas);
        
        
        
       
        
        
    }
    
}
