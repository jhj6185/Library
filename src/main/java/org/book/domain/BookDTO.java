package org.book.domain;

import lombok.Data;

@Data
public class BookDTO {

	private String bookLibraryCode;
	private String bookName;
	private String category;
	private String writer;
	private String publisher;
	private String bookPublishDate;
	private String bookPrice;
	private String bookIsbn;
	private String bookRegDate;
	private String bookImageURL;
	private String bookDescription;
	private String seriesNo;

}
