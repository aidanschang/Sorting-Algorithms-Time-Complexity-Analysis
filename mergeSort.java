import java.util.*;

public class mergeSort {

    public static void merge(int[] S1, int[] S2, int[] S) {
        int i=0, j=0;
        while (i+j <S.length) {
            if (j==S2.length || (i<S1.length && S1[i] <S2[j]))
                S[i+j] = S1[i++];
            else
                S[i+j] = S2[j++];
        }
    }

    public static void mergeSort(int[] array){
        int n = array.length;
        if (n < 2) return;

        int mid = n / 2;
        int[] S1 = Arrays.copyOfRange(array,0, mid);
        int[] S2 = Arrays.copyOfRange(array, mid, n);

        mergeSort(S1);
        mergeSort(S2);

        merge(S1, S2, array);
    }

}
