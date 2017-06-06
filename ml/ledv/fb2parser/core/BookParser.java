package ml.ledv.fb2parser.core;

import java.io.File;

import ml.ledv.fb2parser.model.book.BookContent;
import ml.ledv.fb2parser.model.book.BookDescription;

public interface BookParser {
	public BookDescription getBookDescription(File fileName);
	public BookContent getBookContent(File fileName);
}
