import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("your name is:" + name);

        System.out.println("Enter your lucky number");
        int num_1 = sc.nextInt();

        System.out.println("Lucky Number is:" + num_1);

    }
}
