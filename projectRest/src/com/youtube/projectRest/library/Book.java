package com.youtube.projectRest.library;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
