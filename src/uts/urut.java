/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Widi
 */
public class urut {
    urut(int bil[], String a){
        for (int i = 0; i < bil.length-1; i++) 
        {
            int index = i; 
            for (int j = i+1; j < bil.length; j++){
                if(a.equals("asc")||a.equals("ASC")){
                    if(bil[j] < bil[index])
                        index=j;
                }else{
                    if(bil[j] > bil[index])
                        index=j;
                }
            }
            int temp = bil[index]; 
            bil[index] = bil[i]; 
            bil[i] = temp; 
        } 
    }
    int besar(String a, int bil[]){
        if(a.equals("asc")||a.equals("ASC"))
            return bil[bil.length-1];
        else
            return bil[0];
    }
    int kecil(String a, int bil[]){
        if(a.equals("asc")||a.equals("ASC"))
            return bil[0];
        else
            return bil[bil.length-1];
    }
}
