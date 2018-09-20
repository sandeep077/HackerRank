/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int ar[] = {4, 2, 3, 4};
        int age = ar.length;
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
