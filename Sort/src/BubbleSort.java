import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort (ArrayList<Integer> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arrayList.size();

        for (int i = 0; i < n; i++) result.add(arrayList.get(i));

        for (int step = 0; step < n; step++) {
            for (int i = 0; i < n - 1; i++) {
                if (result.get(i) > result.get(i+1)) {
                    Collections.swap(result, i, i+1);
                }
            }
        }

        return result;
    }
}
