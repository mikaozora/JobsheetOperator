/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;


/**
 *
 * @author ASUS GAMING PC
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        double luas;
        int alas, tinggi;
        
        // membuat Scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== program hitung luas Segitiga ==");
        System.out.print("Input alas : ");
        alas = baca.nextInt();
        System.out.print("Input tinggi : ");
        tinggi = baca.nextInt();
        
        // proses
        luas = Double.valueOf(alas * tinggi) / 2;
        
        // output
        System.out.println("Luas = " + luas);
        System.out.println("==YEEAAAAAY KETEMU==");
        
       
    }
    
}
