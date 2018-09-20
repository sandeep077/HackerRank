/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApple = 0,countOrange = 0;
        
        for (int i = 0; i < apples.length; i++) {
            int dist = a+apples[i];
            if((dist >= s) && (dist <= t)){
                countApple++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int dist = b+oranges[i];
            if((dist >= s) && (dist <= t)){
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }
    static int apples[] = {-2,2,1};
    static int oranges[] = {5,-6};
    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, apples, oranges);
    }
}
