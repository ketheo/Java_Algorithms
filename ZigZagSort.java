import java.util.*;

public class ZigZagSort {

    public static void main (String[] args){
        int arrLength = 20;
        int a[] = new int[arrLength];
        Random rand = new Random();
        for (int k = 0; k < arrLength; k++){
            a[k] = rand.nextInt(100);}
        Arrays.sort(a);
        int mid = ((arrLength + 1)/2) - 1;
        int temp = a[mid];
        a[mid] = a[arrLength - 1];
        a[arrLength - 1] = temp;
    
        int st = mid + 1;
        int ed = arrLength - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < arrLength; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}  
