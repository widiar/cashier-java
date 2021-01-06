/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.io.*;
/**
 *
 * @author Widi
 */
public class soal3 {
    public static void main(String[] args){
        int pil=0;
        boolean pilih=true;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        bangunDatar hasil = new bangunDatar();
        while(pilih){
            try{
                pil = Integer.parseInt(input.readLine());
                pilih=false;
            }catch (Exception ex){
                System.out.println("Inputan Anda bukan angka\n"
                        + "Silahkan Input Ulang");
            }
            switch(pil){
                case 1:
                    int p=0,l=0,kll=0,luas=0;
                    boolean ok=true;
                    p = hasil.inputan("Panjang",p);
                    l = hasil.inputan("Lebar",l);
                    int c=0;
                    hasil.menu();
                    while(ok){
                        ok=false;
                        c = hasil.inputan(c);
                        switch(c){
                            case 1:
                                kll = hasil.persegiPanjang(p, l, 1);
                                break;
                            case 2:
                                luas = hasil.persegiPanjang(p, l);
                                break;
                            case 3:
                                kll = hasil.persegiPanjang(p, l, 1);
                                luas = hasil.persegiPanjang(p, l);
                                break;
                            default:
                                System.out.println("Inputan anda salah");
                                ok=true;
                                break;
                        }
                    }
                    bangunDatar hasilnya = new bangunDatar(kll,luas);
                    break;
                case 2:
                    float a=0,t=0,s=0,kllS=0,luasS=0;
                    boolean oke=true;
                    a = hasil.inputan("Alas",a);
                    t = hasil.inputan("Tinggi",t);
                    s = hasil.inputan("Sisi",s);
                    int d=0;
                    hasil.menu();
                    while(oke){
                        oke=false;
                        d = hasil.inputan(d);
                        switch(d){
                            case 1:
                                kllS = hasil.segitiga(a,t,s);
                                break;
                            case 2:
                                luasS = hasil.segitiga(a,t);
                                break;
                            case 3:
                                kllS = hasil.segitiga(a, t, s);
                                luasS = hasil.segitiga(a, t);
                                break;
                            default:
                                System.out.println("Inputan anda salah");
                                oke=true;
                                break;
                        }
                    }
                    bangunDatar hasilnyaS = new bangunDatar(kllS,luasS);
                    break;
                case 3:
                    float r=0,kllL=0,luasL=0;
                    final float pi=3.14f;
                    boolean okeh=true;
                    r = hasil.inputan("Jari-jari",r);
                    int o=0;
                    hasil.menu();
                    while(okeh){
                        okeh=false;
                        o = hasil.inputan(o);
                        switch(o){
                            case 1:
                                kllL = hasil.lingkaran(r,pi,2f);
                                break;
                            case 2:
                                luasL = hasil.lingkatan(pi,r);
                                break;
                            case 3:
                                kllL = hasil.lingkaran(r,pi,2f);
                                luasL = hasil.lingkatan(pi,r);
                                break;
                            default:
                                System.out.println("Inputan anda salah");
                                oke=true;
                                break;
                        }
                    }
                    bangunDatar hasilnyaL = new bangunDatar(kllL,luasL);
                    break;
                default:
                    System.out.println("Inputan anda salah\n");
                    pilih=true;
                    break;
            }
        } //while
    }
}
