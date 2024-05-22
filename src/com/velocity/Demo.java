package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[]args) {
	Demo demo=new Demo();
	demo.m1();
}
public void m1() {
	List<String> list= new ArrayList<String>();
	list.add("core java");
	list.add("collection framework");
	list.add("SQL");
	list.add("join");
	list.add("GIT");
	System.out.println(list);
}
}
