public class quickSort {
    public static void quickSort(int[] array, int a, int b) {
        if (a>=b) return;
        int left = a;
        int right = b-1;
        int pivot = array[b];
        int temp;

        while (left <= right) {
            while (left<=right && array[left] < pivot) left++;
            while (left<=right && array[right] > pivot) right--;
            if (left<=right) {
                temp = array[left];
                array[left]= array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        temp = array[left];
        array[left] = array[b];
        array[b] = temp;

        quickSort(array,a, left-1);
        quickSort(array,left+1, b);
    }
}
