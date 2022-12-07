package com.beans;

public class Book {
	private String bookIsbn;
	private String bookName;
	private int bookPrice;
	
	public Book() {
		
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookIsbn=" + bookIsbn + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

	public Book(String bookIsbn, String bookName, int bookPrice) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookName.length()/2;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book b=(Book)obj;
		return this.bookIsbn.equals(b.bookIsbn);
	}
	
	
	
	
	
	

}
