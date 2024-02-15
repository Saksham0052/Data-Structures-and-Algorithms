import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>(10);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
////        some methods for arraylist
//        System.out.println(list.contains(90));
//        System.out.println(list);
//        list.set(0 , 99);
//        list.remove(3);

//        input
        for (int i = 0 ; i < 10; i++){
            list.add(in.nextInt());
        }
//        Output
        for (int i = 0 ; i < 10; i++){
            System.out.println(list.get(i));
        }



    }
}
