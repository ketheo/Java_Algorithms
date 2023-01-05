import java.util.*;

public class UniqueNumber{
    /**
     * @param args
     * January 1, 2023
     * For a given array of repeated elements, EXACTELY one element is not repeated. 
     * Guaranteed that list will have only ONE unique number, all other numbers will have a match. 
     */
    public static void main (String[] args){
            //Instantiate and add item to ArrayList.
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(3);
            a.add(1);
            a.add(1);
            a.add(6);
            a.add(6);
            a.add(7);
            a.add(7);

            //First Method: Bitwise XOR
            // 
            //The bitwise XOR (^) operator returns a 1 in each bit position for which 
            //the corresponding bits of either but not both operands are 1s.
            // 0 ^ 6  = 6
            // 6 ^ 1 = 7
            // 7 ^ 7 = 0  THIS is zero because both bits are one; the number is identical.
            // 0 ^ 6 = 6
            // 6 ^ 1 = 7 Return
            //
            //Therefore:
            //      Zero XOR 'Number'= 'Number'
            //    'Number' XOR 'Number' = ZERO

            int x = 0;
            for(int i = 0; i<a.size(); i++){
                x ^= a.get(i);}
            System.out.println("Answer is: " + x);
            
    }
}
