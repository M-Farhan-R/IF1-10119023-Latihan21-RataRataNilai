/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan21.rataratanilai;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Preogram menghitung rata - rata nilai mahasiswa
 *
 */
import java.util.Scanner;

public class IF110119023Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanMhs = new Scanner(System.in);
        Scanner scan;
        System.out.print("Masukkan Banyak Mahasiswa : ");
        int mhs = scanMhs.nextInt();
        
        //deklaraasi array
        int[] nilaiMhs = new int[mhs];
        int totalNilai = 0;
        
        //array harus mulai dari 0
        int i = 0;
        
        do {
            //untuk penomoran mahasiswa
            int j = i+1;
            
            scan = new Scanner(System.in);
            System.out.print("Nilai Mahasiswa ke-"+j+" : ");
            
            //input array
            nilaiMhs[i] = scan.nextInt();
            totalNilai = totalNilai + nilaiMhs[i];
            i++;
        } while(i < mhs);
        System.out.println("");
        
        float rataRata;
        
        //convert int to float(totalNilai)
        rataRata  = (float)totalNilai/mhs;
        
        System.out.println("Maka, Rata-rata Nilainya adalah "+rataRata);
    }

}
