import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        System.out.println(isarmstrong(num));

       for (int i = 100 ; i < 1000 ; i++ ){
           if (isarmstrong(i)){
               System.out.println(i + " ");
           }
       }


    }

    static boolean isarmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0){
            int rem = num%10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
