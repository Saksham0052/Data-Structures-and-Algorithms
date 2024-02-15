public class LinearSearch {
    public static void main(String[] args) {
        int[] arrNums = {1, 23 ,54 ,4 ,6 ,67, 19, 8, 40 } ;
        int index = linearSearch(arrNums , 6);
        System.out.println(index);
    }

    private static int linearSearch(int[] arr , int target) {
        if(arr.length == 0 ){
            return -1;

        }

        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == target){
                return i;

            }
        }
        return -1;

    }
}
