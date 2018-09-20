/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        
        if((x1+v1) == (x2+v2)){
            return "YES";
        }else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        System.out.println(kangaroo(2, 1, 1, 2));
    }
}
