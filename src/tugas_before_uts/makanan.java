/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_before_uts;

/**
 *
 * @author Widi
 */
public class makanan {
    long nasgor, naspecel, ayam, ayamgor, telor;
    long total;
    makanan(long tot){
        total = tot;
        System.out.print("\tMENU MAKANAN\n"
                + "[1] NASGOR\t Rp 11000\n"
                + "[2] Nasi Pecel\t Rp 9000\n"
                + "[3] Ayam\t Rp 8000\n"
                + "[4] Ayam Goreng\t Rp 10000\n"
                + "[5] Telor\t Rp 5000\n>");
    }
    makanan(int nasgor, int naspecel, int ayam, int ayamgor, int telor){
        this.nasgor = nasgor;
        this.naspecel = naspecel;
        this.ayam = ayam;
        this.ayamgor = ayamgor;
        this.telor = telor;
    }
    
    long hasil(int pilihan, int jumlah){
        switch(pilihan){
            case 1: 
               return nasgor*jumlah;
            case 2:
                return naspecel*jumlah;
            case 3:
                return ayam*jumlah;
            case 4:
                return ayamgor*jumlah;
            case 5:
                return telor*jumlah;
        }
        return 0;
    }
    
    long hasil(long total){
        return this.total+=total;
    }

    void menu(){
        System.out.print("[1] Beli makan lagi\n[2] Beli Minum\n[3] Bayar\n>");
    }
}
