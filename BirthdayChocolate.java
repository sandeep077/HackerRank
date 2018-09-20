
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int temp = 0;
        int sum = 0;
        for(int i = 0; i < s.size()-m+1; i++) {
            sum=0;
            temp=0;
            while(temp != m){
                sum+=s.get(i+temp);
                temp++;
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);l.add(2);l.add(1);l.add(3);l.add(2);l.add(1);l.add(2);
        int d = 3, m = 2;
        birthday(l, d, m);
        //System.out.println(birthday(l, d, m));
    }
}
