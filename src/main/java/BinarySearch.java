public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
       int low = 0, high = arr.length -1, mid;

       while(low <= high) {
           mid = low + (high - low / 2);

           if(arr[mid] < target) {
               low = mid + 1;
           } else if (arr[mid] > target) {
               high = mid - 1;
           } else {
               return mid;
           }
       }

       return -(low + 1);
    }

}
