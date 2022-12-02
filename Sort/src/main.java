import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            arrayList.add(value);
        }

//        BadSort badSort = new BadSort();
//        System.out.println(badSort.sort(arrayList));

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(arrayList));
    }
}
