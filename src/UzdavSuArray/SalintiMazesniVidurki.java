package UzdavSuArray;

public class SalintiMazesniVidurki {
	public static void main(String[] args) {

		 int[]array = {1,-2,3,4,5,0};
	        int i=0;
	        int sum=0;
	        double average=0;
	        int arraySize =3;
	        int[] smallerArray=new int [arraySize];
	        for( i=0;i<array.length;i++){
	            //System.out.println(array[i]);
	            sum=sum+array[i];
	            average =sum/array.length;
	        }
	        System.out.println("sum is:"+sum);
	        System.out.println("average is: "+(double)sum/array.length);
	        int j = 0;
	        for( i = 0; i < array.length; i++){
	            if(array[i]> average){
	                smallerArray[j] = array[i];
	                System.out.println(array[i]);
	                j++;
	            }
	        }
	}
}
