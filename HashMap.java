import java.util.HashMap;

public class ExampleHashMap {
public static void main(String[] args) {
	
	// Create a HashMap
	HashMap<String, Integer> hashMap = new HashMap<>();
	
	// Add elements to the HashMap
	hashMap.put("Muskan", 25);
	hashMap.put("M", 30);
	hashMap.put("K", 35);
	
	// Access elements in the HashMap
	System.out.println(hashMap.get("John")); // Output: 25
	
	// Remove an element from the HashMap
	hashMap.remove("Muskan");
	
	// Check if an element is present in the HashMap
	System.out.println(hashMap.containsKey("Muskan")); // Output: false
	
	// Get the size of the HashMap
	System.out.println(hashMap.size()); // Output: 2
}
}

// Out Put
//25
//false
//2
