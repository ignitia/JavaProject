package UzdavSuArray;

public class ByEgle {
	public static void main(String[] args) {
		
		int[] array = {5, 6, 8, 10, 1 ,-3 ,8, 0, -6};
		array = sortAscending(array);

		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] + ", ");
		}
		System.out.println("]");
		}

		public static int[] sortAscending(int[] messyArray) {
		for(int j = 0; j < messyArray.length; j++) {
		for(int i = 0; i < messyArray.length; i++) {
		if(i == messyArray.length - 1) {
		break;
		}
		if(messyArray[i] > messyArray[i+1]) {
		int temp = messyArray[i];
		messyArray[i] = messyArray[i+1];
		messyArray[i+1] = temp;
		}
		}
		}
		return messyArray;
		}
}
