package labsheet04;



public class LabSheet04 {
    static int sum =0;
    
    public static void main(String[] args) throws InterruptedException{
        
        
        
        
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int []first = new int[5];
        int []last = new int[5];
        
        System.arraycopy(arr, 0, first, 0, 5);
        
        System.arraycopy(arr, 5, last, 0, 5);
        
        Thread2 t1 = new Thread2(first);        
        t1.start();
        
        Thread2 t2 = new Thread2(last);        
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(sum);
        
    }   
    
}
