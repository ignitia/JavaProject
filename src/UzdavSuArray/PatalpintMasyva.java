package UzdavSuArray;

import java.util.HashMap;
import java.util.Map;

public class PatalpintMasyva {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int[] numbers = new int[]{3,5,7,34,1,3,6,8,8,5};
		Map<Integer, Integer> map = new HashMap<>();
        for (int key : numbers) {
            if (map.containsKey(key)) {
                int occurrence = map.get(key);
                occurrence++;
                map.put(key, occurrence);
            } else {
                map.put(key, 1);
            }
        }

        for (Integer key : map.keySet()) {
            int occurrence = map.get(key);
            System.out.println(key + " occur " + occurrence + " time(s).");
        }
    }
}
