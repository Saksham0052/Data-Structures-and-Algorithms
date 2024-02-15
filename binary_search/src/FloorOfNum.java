public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        System.out.println(floorOfNumber(arr , target));
    }
    static int floorOfNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target || ((arr[mid] < target) && (arr[mid +1] > target))){
                return arr[mid];
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
