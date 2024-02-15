import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char character = in.next().trim().charAt(0);

        if(character <= 90 && character >= 65 ){
            System.out.println("Character is Upper case");
        }
        else if(character <= 122 && character >= 97 ){
            System.out.println("Character is Lower case");
        }

    }
}
