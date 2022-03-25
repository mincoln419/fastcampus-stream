package com.mermer.ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.mermer.ch4.User;

public class Chapter5Section2 {

	
	public static void main(String[] args) {

		Function<String, Integer> strLength = String::length;
		int length = strLength.apply("hello world");
		System.out.println(length);
	
		
		BiPredicate<String, String> strEquals = String::equals;
		boolean helloEquals = strEquals.test("hello", "world");
		System.out.println(helloEquals);
		
		List<User> users = new ArrayList<>();
		users.add(new User(3, "Alice"));
		users.add(new User(1, "Brown"));
		users.add(new User(2, "White"));
		
		printUserFile(users, User::getName);
	}
	
	
	public static void printUserFile(List<User> users, Function<User, Object> getter) {
		for(User user: users) {
			System.out.println(getter.apply(user));
		}
	}
	
}
