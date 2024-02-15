public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'i', 'j', 'l', 'm'};
        char target = 'j';
        System.out.println(smallestLetter(arr, target));

    }
    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target && arr[mid-1] <= target){
                return arr[mid % arr.length];
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[0];
    }

//    static char smallestLetter2(char[] arr, char target){
//        int start = 0;
//        int end = arr.length -1;
//        while(start <= end){
//            int mid = start + (end- start)/2;
//
//            if(target < arr[mid]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return arr[start % arr.length];
//    }

}
