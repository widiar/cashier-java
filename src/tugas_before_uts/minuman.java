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
public class minuman {
    long tehbotol, cola, fanta, sprite, tehgelas;
    long total;
    minuman(long tot){
        total = tot;
        System.out.print("\tMENU MINUMAN\n"
                + "[1] Teh Botol\t Rp 4500\n"
                + "[2] Coca Cola\t Rp 5000\n"
                + "[3] Fanta\t Rp 6000\n"
                + "[4] Sprite\t Rp 5500\n"
                + "[5] Teh Gelas\t Rp 2000\n>");
    }
    minuman(int tehbotol, int cola, int fanta, int sprite, int tehgelas){
        this.tehbotol = tehbotol;
        this.cola = cola;
        this.fanta = fanta;
        this.sprite = sprite;
        this.tehgelas = tehgelas;
    }
    
    long hasil(int pilihan, int jumlah){
        switch(pilihan){
            case 1: 
               return tehbotol*jumlah;
            case 2:
                return cola*jumlah;
            case 3:
                return fanta*jumlah;
            case 4:
                return sprite*jumlah;
            case 5:
                return tehgelas*jumlah;
        }
        return 0;
    }
    
    long hasil(long total){
        return this.total+=total;
    }

    void menu(){
        System.out.print("[1] Beli minum lagi\n[2] Beli Makan\n[3] Bayar\n>");
    }
}
