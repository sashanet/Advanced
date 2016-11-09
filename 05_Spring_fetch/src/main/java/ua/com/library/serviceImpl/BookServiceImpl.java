package ua.com.library.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.library.dao.BookDao;
import ua.com.library.entity.Book;
import ua.com.library.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;

	public void save(Book book) {
		bookDao.save(book);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	public Book findOne(String title) {
		return bookDao.findOne(title);
	}

	public void delete(String title) {
		bookDao.delete(title);
	}

	@Override
	public void update(Book book) {
		bookDao.update(book);
	}

	@Override
	public Book findBookWithUsers(String title) {
		// TODO Auto-generated method stub
		return bookDao.findBookWithUsers(title);
	}

	@Override
	public List<Book> findAllBy1000() {

		List<Book> books = bookDao.findAll();
		
		List<Book> booksSortBy1000 = new ArrayList<>();
		
		for (Book book : books) {
			if(book.getPages() < 1000){
				booksSortBy1000.add(book);
			}
		}
		
		
		return booksSortBy1000;
	}

	
	
	
	
}