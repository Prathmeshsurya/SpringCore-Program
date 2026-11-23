package com.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Book {
	 private int bookId;
	 private String bookName;
	 private String authorName;
	 private float price;
	 
	 public Book(int bookId, String bookName, String authorName, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	 public int getBookId() {
		 return bookId;
	 }
	 public void setBookId(int bookId) {
		 this.bookId = bookId;
	 }
	 public String getBookName() {
		 return bookName;
	 }
	 public void setBookName(String bookName) {
		 this.bookName = bookName;
	 }
	 public String getAuthorName() {
		 return authorName;
	 }
	 public void setAuthorName(String authorName) {
		 this.authorName = authorName;
	 }
	 public float getPrice() {
		 return price;
	 }
	 public void setPrice(float price) {
		 this.price = price;
	 }
	 
	public void displayDetails() {
	
	  System.out.println("The Book Id Is :"+ bookId);
	  System.out.println("The Book Name Is:"+bookName);
	  System.out.println("The Book Author Name Is :"+authorName);
	  System.out.println("The Book price is :"+price);
	}
	 public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/Book/application-context.xml");
		Book bean = context.getBean("Book",Book.class);
		bean.displayDetails();
	}
}
