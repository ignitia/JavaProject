package UzdavSuArray;

public class MasyvoSk {
	public static void main(String[] args) {

        int[]array = {1,2,3,4,5,0};
        int i=0;
        int sum=0;
        double average=0;
        for( i=0;i<array.length;i++){
            //System.out.println(array[i]);
            sum=sum+array[i];
        }
        System.out.println("sum is:"+sum);
        System.out.println("average is: "+(double)sum/array.length);



    }
}
