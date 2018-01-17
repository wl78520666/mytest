package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import pojo.User;

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<Integer, User> users = new HashMap<>();
		users.put(1, new User("张三", 25));
		users.put(3, new User("李四", 22));
		users.put(2, new User("王五", 28));
		users.put(5, new User("王五", 28));
		users.put(6, new User("王五", 28));
		users.put(9, new User("王五", 28));
		users.put(8, new User("王五", 28));
		System.out.println(users);
		
	}
	
	/*public HashMap<Integer, User> sortMap(HashMap<Integer, User> map){
		
		Set<Entry<Integer,User>> entrySet = map.entrySet();
		for (Entry<Integer, User> entry : entrySet) {
			
		}
		
		return null;
	}*/
	
}
