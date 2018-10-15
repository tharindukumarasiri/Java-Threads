/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet04;
import java.util.Arrays;
/**
 *
 * @author Tharindu
 */
public class qustion4 {
    qustion4(String s){
        search(s);
    }
    
    void search(String s){
        String []arr = s.split(" ");
        int counter=1;
        int times=0;
        for(String word: arr){
            if(word.compareTo("cord")==0){
                System.out.println("word found in "+counter);
                times++;
            }
            counter++;
            if(counter==arr.length && times==0){
                System.out.println("Word not found");
            }
        }
        
    }
}
