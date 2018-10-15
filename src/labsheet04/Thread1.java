/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet04;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Thread1 extends Thread{
    static Thread T1;
    
    int []x = new int[5];
    int sum=0;
    public Thread1(int[] input){
        System.arraycopy(input, 0, x, 0, 5);
        
    }

    
    public void run() {        
       
        for (int i : x){
            sum += i;          
              
        }
        System.out.println(sum);
        
    }
    

}
