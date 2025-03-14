package Assignments.leetcode;

import java.util.Hashtable;

public class ZigZagConversion6 {
    public String convert(String s, int numRows) {
        Hashtable<Integer,String> table = new Hashtable<>();
        String output = "";
        int[] row = new int[s.length()];
        row[0] = 1;
        int increment = 1;
        for(int i = 1; i<s.length();i++){
            if(numRows == 1){
                return s;
            }
            if(row[i-1] == numRows){
                increment = -1;
            }
            if(row[i-1] == 1){
                increment = 1;
            }
            int value = row[i-1];
            row[i] = value + increment;
        }
        System.out.println(row);
        for(int i = 0;i < s.length();i++){
            if(table.containsKey(row[i])){
                String str = table.get(row[i]) + s.charAt(i);
                table.put(row[i],str);
            }
            else{
                table.put(row[i], String.valueOf(s.charAt(i)));
            }
        }
        for(int i = 1;i<=numRows;i++){
            if(table.containsKey(i)){
                output += table.get(i);
            }
        }
        return output;
    }
}

class Main{
    public static void main(String args[]){
        ZigZagConversion6 s = new ZigZagConversion6();
        System.out.println(s.convert("AB",1));
    }
}
