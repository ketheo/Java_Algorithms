import java.util.*;


public class IndexListCountingSort {
    public static void main(String[ ]args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100;  i++){
            int num = (int)(Math.random()*100);
            arr.add(i, num);
            }
        System.out.println("\n" + arr + "\n");
        Collections.sort(arr);
        System.out.println(arr + "\n");
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        
        // Create new list, length 100, filled with zeros.
        for(int i = 0; i < 100; i++){
            indexList.add(i, 0);}
        System.out.println(indexList + "\n");

        //
        for (int k = 0; k < arr.size(); k++){
            int indexNumber = arr.get(k);
            indexList.set(indexNumber, indexList.get(indexNumber) + 1);
        }
        System.out.println(indexList + "\n");
        int matrix[][];
        //matrix[0][0] = 4;
        }
    }

    /*
     * 
    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
    int[] temp = new int[matrix.size()];
    int col = 2;
    int count = 0;
    for(int r = matrix.size()-1; r >= 0; r--){
        int tempNum = (matrix.get(r).get(col));
        temp[count] = tempNum;
        count ++;    
        
    }
    for (int k = 0; k < temp.length; k++){
        System.out.println(temp[k]);
    }

    return 7;
    }

}
     */

