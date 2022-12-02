import java.util.ArrayList;
import java.util.Scanner;

public class BadSort {
    public ArrayList<Integer> sort (ArrayList<Integer> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arrayList.size(), maxElement = 0;

        for (int i = 0; i < n; i++){
            maxElement = Math.max(arrayList.get(i), maxElement);
        }

        for (int value = 0; value <= maxElement; value++) {
            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < n; i++){
                if (arrayList.get(i) == value) {
                    indices.add(i);
                }
            }
            for (int i = 0; i < indices.size(); i++) {
                result.add(value);
            }
        }

        return result;
    }
}
