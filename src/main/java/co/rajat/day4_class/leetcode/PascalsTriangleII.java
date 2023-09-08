package co.rajat.day4_class.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    //119. Pascal's Triangle II
    static public  void main(String[] args){

        System.err.println(generate(1));
    }

    public static List<Integer> generate(int numRows) {

        List<List<Integer>>  result= new ArrayList<>();

        for(int i=0; i<numRows; i++){

            List<Integer> inner= new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0){
                    inner.add(1);
                }
                else if(j==i){
                    inner.add(1);
                }else{
                    inner.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));

                }
            }
            result.add(inner);
        }


        return result.get(numRows-1);
    }
}
