package parjun8840.book.dao.impl;

import parjun8840.book.dao.BookDao;
import parjun8840.book.entity.Book;

public class BookDaoMongoImpl implements BookDao {

	@Override
	public void addBook(Book b) {

		System.out.println("Added: Stored in Mongo database!!");
	}

	@Override
	public Book getBook(int title) {

		return null;
	}

}
