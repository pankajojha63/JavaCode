import java.util.HashMap;
import java.util.Map;

class Main {

	public static String GroupTotals(String[] strArr) {
		// code goes here
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		for (int i = 0; i < strArr.length; i++) {
			if (hmap.containsKey(strArr[i].split(":")[0])) {
				hmap.put(strArr[i].split(":")[0],
						hmap.get(strArr[i].split(":")[0]) + Integer.parseInt(strArr[i].split(":")[1]));
			} else {
				hmap.put(strArr[i].split(":")[0], Integer.parseInt(strArr[i].split(":")[1]));
			}
		}
		String output = "";
		for (Map.Entry<String, Integer> entrySet : hmap.entrySet()) {
			if(entrySet.getValue() != 0){
				output += entrySet.getKey()+":"+entrySet.getValue()+",";
			}
		}
		return output.substring(0,output.length()-1);
	}

	public static void main(String[] args) {
		// keep this function call here
		String[] arr = { "X:-1", "Y:1", "X:-4", "B:3", "X:5" };
		System.out.print(GroupTotals(arr));
	}

}