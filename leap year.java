import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        if(y%400==0 ||(y%4==0 && y%100!=0)){
            System.out.println(y+" is a leap year");
        }else {
            System.out.println(y+" is not a leap year");
        }
    }
}
