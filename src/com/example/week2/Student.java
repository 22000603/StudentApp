package com.example.week2;

public class Student implements Comparable<Student >{
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void setNo(int no) {
		// TODO Auto-generated method stub
		this.no = no;
	}
	public int getNo() {
		return no;}
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	public String getName() {
		return name;}
	
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

}