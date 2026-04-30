import java.util.ArrayList;
import java.util.List;

public class LinearSearchAll {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 5, 9, 3, 7 };
        int target = 5;

        List<Integer> indices = searchAll(arr, target);

        if (indices.isEmpty()) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at indices :" + indices);
        }
    }

    public static List<Integer> searchAll(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
