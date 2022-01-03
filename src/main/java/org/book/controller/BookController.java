package org.book.controller;

import org.book.domain.BookDTO;
import org.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Controller
@Log4j
@RequestMapping("/book/*")
@AllArgsConstructor
public class BookController {
	@GetMapping("/searchIsbn")
	@ResponseBody
	public BookDTO searchIsbn(@RequestParam("isbn") String isbn) {
		BookDTO isbnSearch = BookService.searchIsbn(isbn);
		return isbnSearch;
	}

}
