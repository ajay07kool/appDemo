package com.alacriti.demo.java8.methodreference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// lambda
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));
		//items.forEach(System.out::println);
		
		
		Map<String, Integer> mapitem = new HashMap<>();
		mapitem.put("A", 10);
		mapitem.put("B", 20);
		mapitem.put("C", 30);
		mapitem.put("D", 40);
		mapitem.put("E", 50);
		mapitem.put("F", 60);

		for (Map.Entry<String, Integer> entry : mapitem.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		//using lambda java 8
		
		//items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
	}
}
