public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);


//       Function scope
//       Can not access this because it is not in the scope of main method
//       System.out.println(marks);



//        block scope
//        Anything initialized outside can be used inside the block
//        But anything initialized inside cannot be used outside
        {
              // int a = 34; we can not initialize the value of variables if once declared in  scope of the method in a block
              a = 39; //but we can reassign it
              System.out.println(a);
              int c = 80;
              System.out.println(c);
               // values initialized in this block remains in this block
               // can not be accessed outside it
        }
        int c = 30; // this c has nothing to do with c present in the block
        System.out.println(c);

//        scope for loops

        for ( int i = 0 ; i < 4 ; i++){
//         i cannot be used outside of the loop
        }




    }
    static void random_method(int marks){
        int num = 45;
        System.out.println(num);
        System.out.println(marks);
    }
}
