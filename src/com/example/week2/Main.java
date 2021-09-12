package com.example.week2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<Student>();
			
		list.add(new Student(1, "이효주", 21));
		list.add(new Student(2, "박지후", 21));
		list.add(new Student(3, "박세빈", 21));
		list.add(new Student(4, "강하림", 22));
		list.add(new Student(5, "송하영", 21));
		list.add(new Student(6, "이혜림", 23));
		list.add(new Student(7, "박성희", 25));
		list.add(new Student(8, "최지훈", 25));
		list.add(new Student(9, "남종운", 21));
		list.add(new Student(10, "이동은", 21));
		
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(list);
		for(Student obj : list ) {
			System.out.println(obj.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(list, Collections.reverseOrder());
		for(Student obj : list ) {
			System.out.println(obj.toString());
		}

	}
}