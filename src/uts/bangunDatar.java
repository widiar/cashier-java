/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Widi
 */
public class bangunDatar {
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(in);
    bangunDatar(){
        System.out.print("MENU\n"
                + "[1] Persegi Panjang\n"
                + "[2] Segitiga\n"
                + "[3] Lingkaran\n"
                + ">");
    }
    bangunDatar(int a, int b){
        if (b==0){
            System.out.println("Jadi nilai Keliling: " + a);
        }else if(a==0){
            System.out.println("Jadi nilai Luas: " + b);
        }else{
            System.out.println("Jadi nilai Keliling: " + a);
            System.out.println("Jadi nilai Luas: " + b);
        }
    }
    bangunDatar(float a, float b){
        if (b==0){
            System.out.println("Jadi nilai Keliling: " + a);
        }else if(a==0){
            System.out.println("Jadi nilai Luas: " + b);
        }else{
            System.out.println("Jadi nilai Keliling: " + a);
            System.out.println("Jadi nilai Luas: " + b);
        }
    }
    
    void menu(){
        System.out.print("Ingin mencari:\n"
                + "[1] Keliling\n"
                + "[2] Luas\n"
                + "[3] Keduanya\n");
    }
    
    int inputan(String b, int a){
        while(true){
            System.out.print("Masukkan nilai " + b +": ");
            try{
                a = Integer.parseInt(input.readLine());
                break;
            }catch(Exception ex){
                System.out.println("Inputan Anda bukan angka\n"
                          + "Silahkan Input Ulang");
            }
        }
        return a;
    }
    float inputan(String b, float a){
        while(true){
            System.out.print("Masukkan nilai " + b +": ");
            try{
                a = Float.parseFloat(input.readLine());
                break;
            }catch(Exception ex){
                System.out.println("Inputan Anda bukan angka\n"
                          + "Silahkan Input Ulang");
            }
        }
        return a;
    }
    int inputan(int a){
        while(true){
            System.out.print(">");
            try{
                a = Integer.parseInt(input.readLine());
                break;
            }catch(Exception ex){
                System.out.println("Inputan Anda bukan angka\n"
                          + "Silahkan Input Ulang");
            }
        }
        return a;
    }
    
    int persegiPanjang(int a, int b, int c){
        int kll = 2*(a+b);
        return kll;
    }
    
    int persegiPanjang(int a, int b){
        int luas = a*b;
        return luas;
    }
    
    float segitiga(float a, float b, float c){
        return a+b+c;
    }
    float segitiga(float a, float b){
        return (a*b)/2;
    }
    float lingkaran(float r, float pi, float c){
        return c*pi*r;
    }
    float lingkatan(float pi, float r){
        return pi*r*r;
    }
}
