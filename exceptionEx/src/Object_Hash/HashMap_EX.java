package Object_Hash;

import java.util.HashMap;

public class HashMap_EX {

	public static void main(String[] args) {
		HashMap<Integer, String > hashMap = new HashMap<>();
		
		System.out.println("=============Integer, String =========");
		hashMap.put(1, "박지민");
		hashMap.put(2, "전정국");
		hashMap.put(3, "김태형");
	//	hashMap.put(new String("4"), "김석진");
		
	//	hashMap.get("멤버");
		
		System.out.println("멤버 이름은 :" + hashMap.get(1));
		System.out.println("멤버 이름은 :" + hashMap.get(2));
		System.out.println("멤버 이름은 :" + hashMap.get(3));

		System.out.println("=============String, Integer=========");
		HashMap<String, Integer> hashMap1 = new HashMap<>();
		
		hashMap1.put("1번", 100);
		hashMap1.put("2번", 200);
		hashMap1.put("3번", 300);
		
		System.out.println(hashMap1.get("1번"));
		System.out.println(hashMap1.get("2번"));
		System.out.println(hashMap1.get("3번"));
	}

}
