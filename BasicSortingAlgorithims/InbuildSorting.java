package BasicSortingAlgorithims;

import java.util.*;
import java.util.Collections;

public class InbuildSorting {

    public static void main(String[] args) {

        int arr[] = { 5, 3, 4, 1, 2 };
        // for accending
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Integer crr[] = { 1, 3, 5, 2, 4 };
        // for decending
        Arrays.sort(crr, Collections.reverseOrder());

        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i] + " ");
        }
        System.out.println();

    }

}
