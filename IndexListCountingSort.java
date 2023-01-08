import java.util.*;


public class IndexListCountingSort {
    public static void main(String[ ]args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100;  i++){
            int num = (int)(Math.random()*100);
            arr.add(i, num);
            }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        
        // Create new list, length 100, filled with zeros.
        for(int i = 0; i < 100; i++){
            indexList.add(i, 0);}
        System.out.println(indexList);

        //
        for (int k = 0; k < arr.size(); k++){
            int indexNumber = arr.get(k);
            indexList.set(indexNumber, indexList.get(indexNumber) + 1);
        }
        System.out.println(indexList);
        }
    }

