public class MethodOverloading {
    public static void main(String[] args) {
        display(45);
        display("Saksham");
    }

    static void display(int i) {
        System.out.println(i);
    }
    static void display(String i) {
        System.out.println(i);
    }
}
