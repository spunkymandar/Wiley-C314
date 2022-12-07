package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
	Book findByIsbn(String isbn);

	@Query("")
	Book findItByisbn(String isbn);
	
	@Query(name = "Book.findTitleQuery1")
	Book findItByTitle(String title);
	
}
