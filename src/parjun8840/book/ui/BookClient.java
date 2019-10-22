package parjun8840.book.ui;

import parjun8840.book.dao.BookDao;
import parjun8840.book.dao.BookDaoFactory;
//import parjun8840.book.dao.impl.BookDaoMongoImpl;
import parjun8840.book.entity.Book;
/*
 * In case of interface compiler knows only at the run time which implementation to use. So it is called dynamic binding.
 * Issue with this code- Exposing: We are telling in advance that we are using MongoDB.
 * We have to change the client for DB.
 * Factory: Client will ask the factory to give an Object and factory gives it.
 */
public class BookClient {

	public static void main(String[] args) {
		Book book = new Book("Java", 1200.00);
	//	BookDao bookDao = new BookDaoMongoImpl();// Dynamic binding.
		BookDao bookDao = BookDaoFactory.getBookDao();// Now we are changing interface without changing client.
		bookDao.addBook(book);
		

	}

}
