package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pankaj");
		list.add("Pankaj");
		list.add("Kumar");
		list.add("Ojha");

		List<String> listNew = list.stream().distinct().filter(i -> i.length() > 5).
				collect(Collectors.toList());
		System.out.println(listNew);
	}
}