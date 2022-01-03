package org.book.service;

import org.book.domain.BookDTO;
import org.book.mapper.BookMapper;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

	private BookMapper mapper;

	@Override
	public BookDTO searchIsbn(String isbn) {
		log.info("BookService - isbn : {}" + isbn); // 중앙 도서관api 이용 url
		String seojiUrl = "http://seoji.nl.go.kr/landingPage/SearchApi.do?"
				+ "cert_key=ed56ddf747a94c123780c7a4af79fdc1baf1f4a15c160070a04fc74a77d20122&"
				+ "result_style=xml&page_no=1&page_size=10&isbn=" + isbn;
		BookDTO book = new BookDTO();
		try {
			Document seoji = Jsoup.connect(seojiUrl).data("isbn", isbn).get();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

}