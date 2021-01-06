/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Widi
 */
public class soal4 {
    static InputStreamReader in = new InputStreamReader(System.in);
    static BufferedReader masuk = new BufferedReader(in);
    public static void main(String[] args) throws IOException{
        soal4 masukan = new soal4();
        int jumlah=0;
        String metode;
        System.out.print("Masukan jumlah bilangan: ");
        jumlah = masukan.inputan();
        metode = masukan.metode();
        int bil[] = new int[jumlah];
        for(int i=0;i<bil.length;i++){
            System.out.print("Bilangan ke " + (i+1) + ": ");
            bil[i] = masukan.inputan();
        }
        urut angka = new urut(bil, metode);
        System.out.print("Hasil Pengurutan " + metode.toUpperCase() + ": ");
        for(int i=0 ; i<jumlah ; i++)
            System.out.print(bil[i] + " ");
        System.out.println("\nBilangan terbesar adalah: " + angka.besar(metode, bil));
        System.out.println("Bilangan terkecil adalah: " + angka.kecil(metode, bil));
    }
    
    int inputan(){
        int a;
        while(true){
            try{
                a = Integer.parseInt(masuk.readLine());
                break;
            }catch(Exception ex){
                System.out.println("Inputan Anda bukan angka\n"
                          + "Silahkan Input Ulang\n>");
            }
        }
        return a;
    }
    String metode() throws IOException{
        String a;
        while(true){
            System.out.print("Metode Pengurutan [asc/desc]: ");
            a = masuk.readLine();
            if(a.equals("asc")||a.equals("desc")||a.equals("ASC")||a.equals("DESC"))
                break;
            else
                System.out.println("Maaf Pilihan Anda Salah");
        }
        return a;
    }
}
