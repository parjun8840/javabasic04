package parjun8840.book.dao.impl;

import parjun8840.book.dao.BookDao;
import parjun8840.book.entity.Book;

public class BookDaoDbImpl implements BookDao {

	@Override
	public void addBook(Book b) {
		// This is dummy implementation
		System.out.println("Added: Stored in MySQL database!!");

	}

	@Override
	public Book getBook(int title) {
		return null;
	}

}
