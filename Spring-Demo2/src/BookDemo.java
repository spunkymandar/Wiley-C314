import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.LibrarySet;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method st
//		Book book1=new Book("T48375","Java 9",877);
//		Book book2=new Book("T48375","Java 9",877);
//		Book book3=new Book("T48376","Java 10",877);
//		List<Book> mybooks=new ArrayList<Book>();
//		mybooks.add(book1);
//		mybooks.add(book2);
//		mybooks.add(book3);
//		
//		LibraryList library=new LibraryList();
//		library.setBooks(mybooks);
//		library.displayBooks();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		LibraryList library=(LibraryList)context.getBean("booklibrary");
//		library.displayBooks();
		
		
		LibrarySet library=(LibrarySet)context.getBean("booklibrary");
		library.displayBooks();

	}

}
