package co.rajat.test;

import java.util.*;

public class Test1 {
//input: TTreeeE, output: eeeTTrE
    public  static  void main(String [] dd){
        String input="TTreeeE";

        Map<Character, Integer> map= new HashMap<>();

        for (int i=0; i<input.length();i++){
             if(map.containsKey(input.charAt(i))){
                 map.put(input.charAt(i), map.get(input.charAt(i))+1);
             }else{
                 map.put(input.charAt(i), 1);
             }
        }
        map.entrySet();
    }
}
