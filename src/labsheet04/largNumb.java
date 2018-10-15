/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet04;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Tharindu
 */
public class largNumb {
    largNumb(int []x){
        //numb(Integer.toString(x).toCharArray());
        
        numb(x);
    }
    
    void numb(int []arr){
        Arrays.sort(arr);
        ArrayList list = new ArrayList();
        for(int i:arr){
            String temp = Integer.toString(i);
            char []tempArr = temp.toCharArray();
            list.add(tempArr[0]);
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println(list);
        
        for(int i:arr){
            String temp = Integer.toString(i);
            char []tempArr = temp.toCharArray();
            if(tempArr.length>0){
                for(int j = 1; j < tempArr.length ;j++){
                    int x = list.indexOf(tempArr[0]);
                    list.add(x, tempArr[j]);
                }
            }
            //System.out.println(i);
        }
        System.out.println(list);
    }
}
