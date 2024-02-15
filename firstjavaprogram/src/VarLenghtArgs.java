import java.util.Arrays;

public class VarLenghtArgs {
    public static void main(String[] args) {
        varlength("rahul", 1,2,3,4,5,6,7 );
    }

//    can take more than one argument
    private static void varlength( String name, int ...v ) {
        System.out.println(Arrays.toString(v));
    }
}
