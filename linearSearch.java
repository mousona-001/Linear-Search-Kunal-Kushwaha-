import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = scn.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = scn.nextInt();
        int ans = linear_search(num, target);
//        System.out.println("element found at index: " + ans);
        System.out.println("element found is : " + ans);
    }

    // search the target and return the element
    static int linear_search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;




    // search the target and return the index at which the target is found
//    static int linear_search(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for(int index = 0; index < arr.length; index++){
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }
////        return -1; // this line will execute if none of the return statement above have executed. Hence, the target is not found.
    }
}
