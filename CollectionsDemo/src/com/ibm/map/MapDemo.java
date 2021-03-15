package com.ibm.map;
import java.util.Map;
import java.util.HashMap;

import com.ibm.Book;
public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}
	private static void createMapofBooks() {
		Map<String , Book> books = new HashMap<String , Book>();
		System.out.println(books.size());
		Book book1 = new Book("java");
		books.put("java", book1);
		System.out.println(books.size());
		for (int i = 1; i <=10 ; i++) {
			Book book = new Book("java" + i);
			books.put("book"+i,book);

	}
		System.out.println(books.size());
		System.out.println(books.keySet());
		System.out.println(books.containsKey("java3"));
		

}}
