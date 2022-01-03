package org.book.service;

import org.book.domain.BookDTO;

public interface BookService {
	public BookDTO searchIsbn(String isbn);
}
