import java.util.HashMap;
import java.util.List;

class Result {

	public static int migratoryBirds(List<Integer> arr) {

		HashMap<Integer, Integer> map = new HashMap<>();
		// Store frequency of each element in the list
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		int maxFrequency = -1;
		int mostFrequent = -1;
		for (int i : map.keySet()) {
			if (map.get(i) > maxFrequency) {
				maxFrequency = map.get(i);
				mostFrequent = i;
			} else if (map.get(i) == maxFrequency) {
				mostFrequent = Math.min(mostFrequent, i);
			}
		}
		return mostFrequent;

	}

}