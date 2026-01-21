package com.generics.pratices.basic;
public class Main {

	public static void main(String[] args) {
		Box<String> trash = new Box<>();
		trash.set("phone");
		
		System.out.println(trash.get());
		
		Box<Integer> study = new Box<>();
		study.set(4);
		System.out.println(study.get());
		
		Box<? extends String> list  = trash;
		System.out.println(list.get());
		
		Box<? super Integer> l = study;
		System.out.println(l.get());
		
		l.set(100);
		System.out.println(l.get());
	}
}

class Box<T>{
	T val;
	
	public void set(T val) {
		this.val = val;
	}
	
	public T get() {
		return val;
	}
}