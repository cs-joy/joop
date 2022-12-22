package org.neutral_networks.ie;

public class arrayRecursion {
    public int sumofArrayElements(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                sum += arr[i];
            } else {
                return 0;
            }
        }

        return sum;
    }
}
