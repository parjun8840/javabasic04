package parjun8840.book.dao;

import java.util.ResourceBundle;

import parjun8840.book.dao.impl.BookDaoMongoImpl;
//Factories can pick from the config file and give the Implementation object.
public class BookDaoFactory {
	private static String name ="";//
	static {// Block gets automatically execute as soon as the Class Loader loads the it(class). Only once loaded.
		//Gurranted execution, constructor gets executed when the Object is created.
		ResourceBundle res = ResourceBundle.getBundle("config");
		name = res.getString("BOOK_DAO");
	}
	// For resource bundle "." operator means package. "config" means not in any package. 
	//For resource bundle it has to be .properties file.
	//Programatically loading class: Class.forName(name)
	// Creating an object using reflection api: Class.forName(name).newInstance();
	
	public static BookDao getBookDao() {
		try {
			return (BookDao) Class.forName(name).newInstance();
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	/* To manually create Object of Dao
	public static BookDao getBookDao() {
	
		
		return new BookDaoMongoImpl();
	}
    */
}
