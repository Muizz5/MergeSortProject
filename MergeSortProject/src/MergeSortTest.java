import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>(Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        ));

        System.out.println("Original List:");
        System.out.println(months);

        ArrayList<String> sortedMonths = MergeSort.mergeSort(months);

        System.out.println("\nSorted List:");
        System.out.println(sortedMonths);
    }
}