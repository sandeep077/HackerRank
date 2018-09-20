/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = ar[i]+ar[j];
                if(sum%k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6};
        divisibleSumPairs(6, 5, ar);
    }
}
