public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 10, 19, 25, 47 };
        int target = 47;

        int result = binarySearchIterative(arr, target);

        if (result == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return 1; // found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return 0; // not found
    }
}
