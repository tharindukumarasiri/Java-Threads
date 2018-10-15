/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet04;

/**
 *
 * @author Tharindu
 */
public class multiTable {
    int [][]multiArr = new int[10][10];
    
    void multiMethod(){

        for(int i= 0; i<10; i++){
            for(int j=0; j<10; j++){
                multiArr[j][i]=j;
                //System.out.println(j);
            }
            //System.out.println();
        }
    }
    
    void printArr(){
        for(int i= 0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(((multiArr[j][i]+1)*i)+"   ");
            }
            System.out.println();

        }
    }
}
