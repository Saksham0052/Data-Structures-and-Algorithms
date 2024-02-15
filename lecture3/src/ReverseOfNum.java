public class ReverseOfNum {
    public static void main(String[] args) {
       int num = 1534236469;
       long ans = 0;

       while (num>0){
           long rem = num%10;
           ans = ans*10 + rem;
           num /= 10;
       }
        System.out.println(ans);
    }
}
