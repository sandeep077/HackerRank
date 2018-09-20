/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class StairCase {

    public static void main(String[] args) {
        
        int n=5;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(" ");
        }
        int j = 0;

        for (int i = 1; i <= n; i++) {
            builder.replace(builder.length() - i,
                    builder.length() - j, "#");
            System.out.println(builder);
            j++;
        }
    }
}
