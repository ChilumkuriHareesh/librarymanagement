package com.capgemini.librarymanagement.beans;

public class Books {
	private String bookId;
	private String title;
	private String authorName1;
	private String authorName2;
	private String publisher;
	private String yearOfPublication;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName1() {
		return authorName1;
	}
	public void setAuthorName1(String authorName1) {
		this.authorName1 = authorName1;
	}
	public String getAuthorName2() {
		return authorName2;
	}
	public void setAuthorName2(String authorName2) {
		this.authorName2 = authorName2;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", title=" + title + ", authorName1=" + authorName1 + ", authorName2="
				+ authorName2 + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + "]";
	}
	
    


}
