import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] numbers = {1,2,3,4};
        System.out.println(DuplicateSort(numbers));
        System.out.println("---------------------------------------------------------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(202);
        arrayList.add(33);
        arrayList.add(45);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Item at position 0=> "+arrayList.get(0));

        System.out.println("------------------------------------------------------------------------ ");
        int [][] myNumbers = {{1,4,5},{5,8,9}};
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j]+" ");
            }

        }
        System.out.println("------------------------------------------------------------------------ ");
    }


    public static boolean DuplicateSort(int[] array) {
    /* Sort method uses more time O(n log n) and less space O(1) */
    Arrays.sort(array);
    for (int i = 1; i < array.length; i++) {
        if(array[i] == array[i-1]) {
            return true;
        }
    }
    return false;
    }

    public static boolean DuplicateHash(int[] array) {
    /* Hash methods uses more space but less time */
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(map.contains(array[i])) {
                return true;
            }
            map.add(array[i]);
        }

        return false;
    }
}