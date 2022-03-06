package com.mermer.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* functional interface 
 * Comparator - 비교
 * */
public class Chapter4Section5 {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User(3, "Alice"));
		users.add(new User(2, "Ted"));
		users.add(new User(1, "Michel"));
		
		
		
		Comparator<User> myCompare = (o1, o2) -> o1.getId() - o2.getId();
		
		//id 오름차순
		Collections.sort(users, myCompare);
		System.out.println(users);
		
		//이름 오름차순
		Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
		
		System.out.println(users);
		
	}
	
}
