public class maxValue2DArray {
    public static void main(String[] args) {
        int[][] num = {
                {12,34,5,9},
                {3,4,78},
                {10,22,100}
        };
        System.out.println(max(num));

    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for(int element: ints){
                if(element > max){
                    max = element;
                }
            }

        }
        return max;
    }
}
