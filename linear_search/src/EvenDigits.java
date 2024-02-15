public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-3957));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

     static boolean even(int num) {
        int noOfDigits = digits(num);
        if (noOfDigits % 2 == 0){
            return true;
        }
        return false;

    }

     static int digits(int num) {

        if (num<0){
            num = num * -1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

//    Method 2 to find the no of digits in a number
    static int digits2(int num) {

        if (num<0){
            num = num * -1;
        }

        return (int)(Math.log10(num)) +1;
    }
}
