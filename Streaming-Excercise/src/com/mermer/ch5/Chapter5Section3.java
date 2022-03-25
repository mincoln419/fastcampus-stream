package com.mermer.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.mermer.ch4.User;

public class Chapter5Section3 {

	
	public static void main(String[] args) {

		User user = new User(1, "Alice");
		
		BiFunction<Integer, String, User> userCreator = User::new;
		
		User jack = userCreator.apply(2, "Jack");
		
		System.out.println(jack.toString());
		
		
		Map<String, BiFunction<String, String, Car>> carTypeToConstructorMap = new HashMap<>();
		carTypeToConstructorMap.put("sedan", Sedan::new);
		carTypeToConstructorMap.put("van", Van::new);
		carTypeToConstructorMap.put("suv", Suv::new);
		
		String[][] inputs = new String[][] {
			{"sedan", "Sonata", "Hyundai"},
			{"van", "Sienna", "Toyota"},
			{"sedan", "Model S", "Tesla"},
			{"suv", "Sorento", "KIA"}
		};
		
		List<Car> cars = new ArrayList<>();
		for(int i = 0 ; i < inputs.length; i++) {
			String[] input = inputs[i];
			String cartype = input[0];
			String name = input[1];
			String brand = input[2];
			cars.add(carTypeToConstructorMap.get(cartype).apply(name, brand));
		}
		
		for(Car car : cars) {
			car.drive();
		}
		
	}
	

	
}
