/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class GradingStudent {

    public static void main(String[] args) {
        final int passingGrade = 40;
        int arr[] = {72, 67, 38, 33};
        int ans[] = new int[arr.length];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 38) {
                temp = arr[i];
                while (arr[i] % 5 != 0) {
                    arr[i]++;
                }
                if((arr[i] - temp) >= 3){
                    arr[i] = temp;
                }
                ans[i] = arr[i];
            }else{
                ans[i] = arr[i];
            }
        }
        
    }
}
