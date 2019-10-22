package parjun8840.book.dao;

import parjun8840.book.entity.Book;
/*
 * methods are public and abstract by default.
 * interfaces and implementation are normally in different package.
 */
public interface BookDao {
	void addBook(Book b);
	Book getBook(int title);

}
