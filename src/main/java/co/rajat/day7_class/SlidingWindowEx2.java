package co.rajat.day7_class;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowEx2 {
    //1876. Substrings of Size Three with Distinct Characters
    public static void main(String ss[]){
      //  String qsa="xyzzaz";
        String qsa = "aababcabc";
        int goodCount=0;
       if(isGood(qsa.substring(0,3))){
           goodCount++;
       }
      for (int i=3;i< qsa.length();i++){
        if(isGood(qsa.substring((i-3)+1,i+1)))
            goodCount++;
      }
      System.err.println(goodCount);
    }
    public static boolean  isGood(String subString){
        Set<Character> set= new HashSet<>();
        for(int i=0; i<subString.length();i++){
            if(!set.add(subString.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
