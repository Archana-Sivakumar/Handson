import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayerMaximumScore {

	public static void main(String[] args) {

		Map<String, Integer> hmap = new HashMap<String, Integer>();

		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int noOfPlayers = s.nextInt();
        
		String key = "";
		int value = 0;
		int k = 1;

		for (int i = 0; i < noOfPlayers; i++) {
			System.out.println("Enter the details of the player " + k);
			key = s.next();
			value = s.nextInt();
			hmap.put(key, value);
			k++;
		}

	Map.Entry<String, Integer> f = hmap.entrySet().iterator().next();
		String largeKey = f.getKey();
		Integer lkeyValue = f.getValue();

		for (Map.Entry<String, Integer> map : hmap.entrySet()) {
			int temp = map.getValue();
			if (temp > lkeyValue) {
				lkeyValue = temp;
				largeKey = map.getKey();
			}
		}
		System.out.println(largeKey);
		
		/*Set<String> keys = hmap.keySet();
		Iterator<String> itr = keys.iterator();
		String keyName = " ";
		Integer temp = 0;
		while(itr.hasNext()) {
			keyName = itr.next();
			int valueName = hmap.get(keyName);

			if (temp < valueName) {
				 temp = valueName;
			}
		}
		System.out.println();*/
	}

}

