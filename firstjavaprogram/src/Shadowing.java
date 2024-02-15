public class Shadowing {
    static int x = 90; // This will be shadowed by line 6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40; // Scope begins when the value is initialized
        System.out.println(x); //40  This will  override the x of shadowing class scope

        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
