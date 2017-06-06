package ml.ledv.fb2parser.model.book;

public class PublishInfo {
	private String bookName = "";
	private String publisher = "";
	private String city = "";
	private String year = "";
	private String isbn = "";
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	@Override
	public String toString() {
		return "\nbookName=" + bookName + "\n publisher=" + publisher + "\n city=" + city + "\n year=" + year
				+ "\n isbn=" + isbn;
	}
}
