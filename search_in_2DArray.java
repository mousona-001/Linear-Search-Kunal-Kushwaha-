import java.util.Arrays;

public class search_in_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,5,9},
                {3,4,78},
                {10,22}
        };
        int target = 22;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
         return new int[]{-1,-1};
    }
}
