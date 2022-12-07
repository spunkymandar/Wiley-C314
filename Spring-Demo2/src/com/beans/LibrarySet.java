package com.beans;

import java.util.HashSet;

public class LibrarySet {
	
	//HashMap<"Java", List<Book>>=new HashMap<String,List<Book>>
	
	HashSet<Book> books;

	public HashSet<Book> getBooks() {
		return books;
	}

	public void setBooks(HashSet<Book> books) {
		this.books = books;
	}
	
	public void displayBooks() {
		for(Book b:books) {
			System.out.println(b);
		}
	}

}
