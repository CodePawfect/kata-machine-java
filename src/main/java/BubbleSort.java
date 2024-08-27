public class BubbleSort {

    public int[] sort(int[] arr) {
        for(int i = arr.length -1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                int temp;
                if(j + 1 > i) break;
                if(arr[j] > arr[j +1]) {
                    temp = arr[j +1];
                    arr[j +1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}