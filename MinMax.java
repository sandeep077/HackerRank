/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class MinMax {

    public static void main(String[] args) {
        long arr[] = new long[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
//        arr[0] = 5;
//        arr[2] = 5;
//        arr[4] = 5;
//        arr[1] = 5;
//        arr[3] = 5;
        long sum[] = new long[arr.length];
        boolean isEqual = true;
        long num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                isEqual = false;
            }
        }
        if (isEqual) {
            long s = 0;
            for (int i = 1; i < arr.length; i++) {
                s += arr[i]; 
            }
            System.out.println(s+" "+s);
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        continue;
                    }
                    sum[i] += arr[j];
                }
            }
            long max = sum[0], min = sum[0];
            for (int i = 0; i < sum.length; i++) {
                if (sum[i] > max) {
                    max = sum[i];
                }
                if (sum[i] < min) {
                    min = sum[i];
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
