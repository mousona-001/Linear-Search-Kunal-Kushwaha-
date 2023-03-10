import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = scn.nextInt();
        }
        System.out.println("Minimum value is : " + MinValue(num));

    }
    //assume min value is 0th index
    static int MinValue(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
                return ans;
            }
        }
         return -1;
    }



}
