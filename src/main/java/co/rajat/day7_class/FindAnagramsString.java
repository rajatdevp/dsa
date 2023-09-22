package co.rajat.day7_class;
import java.util.*;

public class FindAnagramsString {
    public static void main(String[] args){
        System.err.println(findAnagrams("abab","ab"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] patFreq = new int[26];
        int[] winFreq = new int[26];
        int startIndex=0;
        for(int i=0 ; i<p.length() ; i++){
            patFreq[p.charAt(i)-'a']++;
        }

        for(int i=0 ; i<s.length() ; i++){

            winFreq[s.charAt(i) - 'a']++;

            if((i - startIndex + 1) > p.length()){
                winFreq[s.charAt(startIndex++) - 'a']--;
            }

            if((i-startIndex + 1 == p.length())&& isAnagram(winFreq, patFreq)){
                ans.add(startIndex);
            }

        }
        return ans;
    }
    public  static boolean isAnagram(int[] arr1, int[] arr2){
        for(int i = 0;i<arr1.length;i++ ){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

}
