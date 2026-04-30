public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 47, 8, 19};
        int target = 47;

        int result = linearSearch(arr, target);

        if(result ==1){
            System.out.println("Target found in the array");
        }
        else{
            System.out.println("Target not found in the array");
        }
    }

 
    public static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length-1;i++){
            if(target == arr[i]){
                return 1; //found
            }
        }
        return 0; // not found
    }
}