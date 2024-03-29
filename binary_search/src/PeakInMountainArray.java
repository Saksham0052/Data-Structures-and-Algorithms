public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        System.out.println(peaK(arr));
    }

    private static int peaK(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid+1] < arr[mid]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
