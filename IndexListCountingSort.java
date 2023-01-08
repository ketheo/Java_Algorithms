import java.util.*;


public class IndexListCountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
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
        return indexList;
        }
}
