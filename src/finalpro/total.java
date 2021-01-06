/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;

/**
 *
 * @author Widi
 */
public class total {
    int harga;
    int jumlah;
    total(String jumlah){
        this.jumlah=Integer.parseInt(jumlah);
    }
    void totalHarga(total brg, String harga){
        this.harga=brg.jumlah*Integer.parseInt(harga);
    }
}
