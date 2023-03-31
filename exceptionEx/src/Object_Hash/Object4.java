package Object_Hash;

import java.util.HashMap;

public class Object4 {
	public static void main(String[] args) {
		
		HashMap<Key, String> keyMap = new HashMap<>();
		
		Key key = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		System.out.println("key == key3 " + key.equals(key3));
		
		keyMap.put(key, "박지민");
		keyMap.put(key2, "김태형");
		keyMap.put(key3, "전정국");
		
		System.out.println(keyMap.get(key));
		System.out.println(keyMap.get(key2));
		System.out.println(keyMap.get(key3));
	
	}
	
	public void checkEquals() {
		//new로 생성하면 key의 주소가 다름 
		Key key1 = new Key(10);
		Key key2 = new Key(10);
		
		//세로 선택 alt + shift + a 
		System.out.println("key1");
		System.out.println(key1.hashCode());
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		
		System.out.println("=======================");
		
		System.out.println("key2");
		System.out.println(key2.hashCode());
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		
		System.out.println("=======================");
		
		System.out.println(key1.equals(key2));
				
				
		}
}
	

