import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<String> mergeSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        ArrayList<String> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<String> right = new ArrayList<>(list.subList(mid, list.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> merged = new ArrayList<>();

        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareToIgnoreCase(right.get(j)) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}