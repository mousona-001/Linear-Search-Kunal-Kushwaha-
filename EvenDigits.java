public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,5656};
//        System.out.println(findNumbers(arr));
        System.out.println(digits(-90));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums){
            if(even(num))
                count++;
        }
        return count;
    }

    // check whether the number contains even digits or not.
    static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int nums){
        int count = 0;
        // if number is negative
        if(nums < 0){
            nums = nums * -1;
        }
        while(nums > 0){
            count ++;
            nums = nums / 10;
        }
        return count;
    }
}
