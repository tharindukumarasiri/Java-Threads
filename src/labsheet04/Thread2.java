/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet04;


public class Thread2 extends Thread{
    
    
    
    int []x = new int[5];
    int tot=0;
    public Thread2(int[] input){
        System.arraycopy(input, 0, x, 0, 5);
        
    }

    
    public void run() {        
       
        for (int i : x){
            tot += i;          
              
        }
        //System.out.println(tot);
        synchronized (Thread2.class){
            LabSheet04.sum = tot+LabSheet04.sum;
        }
        
       
        
        
    }

    

}
