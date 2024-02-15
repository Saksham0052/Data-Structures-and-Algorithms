import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args){
        int[] arr = { 5, 7, 7, 7, 7, 9, 11 , 12};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastOccurrence(arr , target)));
    }
    static int[] firstAndLastOccurrence(int[] arr , int target){
        int[] ans = {-1, -1};

        ans[0] = search(arr , target , true);
        if(ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    private static int search(int[] arr, int target, boolean firstOccurrence) {
        int ans = 0;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                ans = mid; // possible ans
                if (firstOccurrence){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return ans;
    }
}
