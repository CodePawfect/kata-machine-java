public class MergeSort {

    public void sort(int[] arr) {
        if(arr == null || arr.length <= 1) return;

        int mid = arr.length / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for(int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for(int j = 0; mid < arr.length; mid++, j++) {
            rightArr[j] = arr[mid];
        }

        sort(leftArr);
        sort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    private void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while(i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

}
