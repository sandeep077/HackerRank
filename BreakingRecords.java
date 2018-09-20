/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class BreakingRecords {
    static int[] breakingRecords(int[] scores) {
        int countMax=0,countMin=0;
        int tempHigh = scores[0];
        int tempLow = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > tempHigh){
                countMax++;
                tempHigh = scores[i];
            }
            if(scores[i] < tempLow){
                countMin++;
                tempLow = scores[i];
            }
        }
        int a[] = {countMax,countMin};
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,20,20,4,5,2,25,1};
         int a[] = breakingRecords(arr);
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
        }
    }
}
