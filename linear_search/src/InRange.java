public class InRange {
    public static void main(String[] args) {
        int[] arrNums = {1, 23 ,54 ,4 ,6 ,67, 19, 8, 40 } ;
        System.out.println(search(arrNums , 6 , 2 , 6));
    }

    private static int search(int[] arrNums, int target , int start , int end) {
        if(arrNums.length == 0){
            return -1;

        }
        for (int i = start; i<= end; i++ ){
            if (arrNums[i] == target){
                return i;

            }
        }
        return -1;
    }
}
