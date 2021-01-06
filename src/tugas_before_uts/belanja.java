/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_before_uts;
import java.io.*;

/**
 *
 * @author Widi
 */
public class belanja {
    public static void main(String args[]){
        //deklarasi variabel
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        int pil=0;
        long total = 0, totalMakan=0, totalMinum=0, tmp = 0, tmp2 = 0, bayar = 0;
        
        //buat menu
        System.out.print("\tMENU\n[1] Makanan\n[2] Minuman\n[3] Bayar\n>");
        try {
            pil = Integer.parseInt(input.readLine());
        } catch (Exception ex) {
            System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
            System.exit(0);
        }
        //pake while karna isi input lagi kesini
        while(pil<=3){
            switch(pil){
                case 1:
                    int pilih=0; long tMakan=tmp;
                    //set total sebelumnya
                    makanan orang = new makanan(tMakan);
                    //set harga
                    makanan harga = new makanan(11000, 9000, 8000, 10000, 5000);
                    try{
                        pilih = Integer.parseInt(input.readLine());
                    }catch (Exception ex){
                        System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                        System.exit(0);
                    }
                    //buat jumlah
                    if(pilih>0 && pilih <6){
                        System.out.print("Masukkan jumlah: ");
                        int jum=0 ;
                        try{
                            jum = Integer.parseInt(input.readLine());
                        }catch (Exception ex){
                            System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                            System.exit(0);
                        }
                        tmp = harga.hasil(pilih, jum);
                        System.out.println("Jadi total : Rp" + tmp);
                        totalMakan=orang.hasil(tmp);
                        System.out.println("Total belanja makanan : Rp" + totalMakan);
                        System.out.println("------------------------------------");
                        //nampilin menu selanjutnya
                        orang.menu();
                        int pilih2 = 0;
                        try{
                            pilih2 = Integer.parseInt(input.readLine());
                        }catch (Exception ex){
                            System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                            System.exit(0);
                        }
                        switch(pilih2){
                            case 1:
                                pil=1;
                                break;
                            case 2:
                                pil=2;
                                break;
                            case 3:
                                pil=3;
                                break;
                        }
                    }else
                        System.out.println("Pilihan tidak ada di menu");
                    break;
                case 2:
                    //sama kyk atas
                    int pilih2=0; long tMinum=tmp2;
                    minuman dia = new minuman(tMinum);
                    minuman harganya = new minuman(4500, 5000, 6000, 5500, 2000);
                    try{
                        pilih2 = Integer.parseInt(input.readLine());
                    }catch (Exception ex){
                        System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                        System.exit(0);
                    }
                    if(pilih2>0 && pilih2 <6){
                        System.out.print("Masukkan jumlah: ");
                        int jum=0 ;
                        try{
                            jum = Integer.parseInt(input.readLine());
                        }catch (Exception ex){
                            System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                            System.exit(0);
                        }
                        tmp2 = harganya.hasil(pilih2, jum);
                        System.out.println("Jadi total : Rp" + tmp2);
                        totalMinum=dia.hasil(tmp2);
                        System.out.println("Total belanja minum : Rp" + totalMinum);
                        System.out.println("------------------------------------");
                        dia.menu();
                        int pili = 0;
                        try{
                            pili = Integer.parseInt(input.readLine());
                        }catch (Exception ex){
                            System.out.println("Pilihan anda bukan angka\nPROGRAM AKAN TERHENTI");
                            System.exit(0);
                        }
                        switch(pili){
                            case 1:
                                pil=2;
                                break;
                            case 2:
                                pil=1;
                                break;
                            case 3:
                                pil=3;
                                break;
                        }
                    }else
                        System.out.println("Pilihan tidak ada di menu");
                    break;
                case 3:
                   System.out.println("------------------------------------");
                   total = totalMakan + totalMinum;
                   System.out.println("Total Belanja Keseluruhan : Rp" + total);
                   System.out.print("Masukkan uang pembayaran\n> Rp");
                   try{
                       bayar = Integer.parseInt(input.readLine());
                   }catch (Exception ex){
                       System.out.println("Anda memasukkan yang bukan angka\nPROGRAM AKAN TERHENTI");
                       System.exit(0);
                   }
                   System.out.println("------------------------------------");
                   System.out.println("Uang Kembalian: Rp" + (bayar-total));
                   pil=4;
            }
        } //while
        
    } //main
} //public class
