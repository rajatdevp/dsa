package co.rajat.day7_class;

public class SlidingWindowEx1 {

    public  static void  main(String[] ddd){
        int[] arr= {100,200,300,400};
        int k=3;
        int sum =0,max=0;
        for(int i=0;i<k;i++){
            sum +=arr[i];
        }

        max= Math.max(sum, max);
        for(int j=k; j<arr.length;j++){

            sum =(sum+arr[j])-arr[j-k];
            max= Math.max(sum, max);
        }
        System.err.println(max);
    }
}
