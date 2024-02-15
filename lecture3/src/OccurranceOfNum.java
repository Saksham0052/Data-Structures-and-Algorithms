public class OccurranceOfNum {
    public static void main(String[] args) {
//        Find how many times the number 8 has been occurred
        long n = 1896789898;
        int count = 0;

        while (n > 0){
            long rem = n%10;
            if (rem == 8){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
