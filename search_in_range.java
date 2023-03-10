import java.util.Scanner;

public class search_in_range {
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
        int ans = searchInRange(num, target, 0, 3);
        System.out.println("element found is : " + ans);
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}
