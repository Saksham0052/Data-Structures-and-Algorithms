public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int target = 7;
        System.out.println(findInMountainArray(arr, target));
    }

    private static int findInMountainArray(int[] arr, int target) {
        int peak = peaK(arr);
        int firstTry = orderAgnosticbinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticbinarySearch(arr, target, peak, arr.length - 1);
        }
    }

    private static int peaK(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticbinarySearch(int[] arr, int target, int start, int end) {


        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}
