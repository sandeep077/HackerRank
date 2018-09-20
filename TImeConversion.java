
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tapaswi
 */
public class TImeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        String arr[] = s.split(":");
        
        if(arr[2].length() == 4){
            String sub1 = arr[2].substring(0, 2);
            String sub2 = arr[2].substring(2);
            arr[2] = sub1+" "+sub2;
        }
        String time = arr[0]+":"+arr[1]+":"+arr[2];
        
        SimpleDateFormat display = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        Date d;
        try {
            d = parseFormat.parse(time);
            String formatedString = display.format(d);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
