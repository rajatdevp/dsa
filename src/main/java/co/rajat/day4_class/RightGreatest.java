package co.rajat.day4_class;

public class RightGreatest {
	public static void main(String[] ss) {
		 int[] arr= {3,5,3,6,1,4,9,2};
		 int max=0;
		 
		 for(int i=arr.length-1; i>=0;i--) {
			  int temp=arr[i];
			  arr[i]=max;
			  if(temp>max) {
				  max=temp;
				  
			  }
		 }

        for (int j : arr) {
            System.err.print(j + ",");
        }
		 
		 
	}
}
