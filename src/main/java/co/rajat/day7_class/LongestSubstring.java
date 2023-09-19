package co.rajat.day7_class;

import java.util.*;
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();

        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                //max= Math.max(max ,j-i );
                j++;
                max=Math.max(max,j-i);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

}
