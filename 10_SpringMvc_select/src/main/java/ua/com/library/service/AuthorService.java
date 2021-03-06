package ua.com.library.service;

import java.util.List;

import ua.com.library.entity.Author;

public interface AuthorService {

	void save(Author author);
	List<Author> findAll();
	Author findOne(int id);
	void delete(int id);
	
	void addBookToAuthor(Author author, String [] bookIds);
	
	void deleteBookFromAuthor(String idBook);
	
	List<Author> findAuthorWithBooks();
	
}
