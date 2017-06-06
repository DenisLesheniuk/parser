import java.io.File;

import ml.ledv.fb2parser.core.BookParser;
import ml.ledv.fb2parser.core.BookParserFB2;

public class MainClass {

	public static void main(String[] args) {
		BookParser parser = new BookParserFB2();
		File file = new File("Боумен Салли. Актриса - royallib.ru.fb2");
		System.out.println(parser.getBookDescription(file));
		
		

	}

}
