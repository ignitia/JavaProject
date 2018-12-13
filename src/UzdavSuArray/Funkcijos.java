package UzdavSuArray;

public class Funkcijos {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,0};
		int sum = arrayEmentsum(array);
		int i = 0;
		System.out.println(sum);
	}


private static int arrayEmentsum (int[] array) {
		int sum=0;
		
	for( int i=0;i<array.length;i++){
         sum=sum+array[i];   
    }
	return sum;
	}
}
