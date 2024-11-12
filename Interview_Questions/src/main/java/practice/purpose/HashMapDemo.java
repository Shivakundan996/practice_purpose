package practice.purpose;

import java.util.HashMap;

public class HashMapDemo {
	
	
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "shiva");
		hashMap.put(2, "krishna");
		hashMap.forEach((k,v) -> {
			System.out.println(k+":"+v);
		});
	}

}
