import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int sum_1 = sc.nextInt();

        System.out.println("Enter Second number");
        int sum_2 = sc.nextInt();

        int sum = sum_1 + sum_2;

        System.out.println("Answer is:" + sum);
    }
}
