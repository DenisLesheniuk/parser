package ml.ledv.fb2parser.model.book;

public class BookDescription {
	private String genre = "";
	private String bookTitle = "";
	private String annotation = "";
	private Author author;
	private PublishInfo publishInfo;
	
	
	public BookDescription() {
		this.author = new Author();
		this.publishInfo = new PublishInfo();
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public PublishInfo getPublishInfo() {
		return publishInfo;
	}
	public void setPublishInfo(PublishInfo publishInfo) {
		this.publishInfo = publishInfo;
	}
	@Override
	public String toString() {
		return "Book genre=" + genre + "\n bookTitle=" + bookTitle + "\n annotation=" + annotation + "\n author=" + author
				+ "\n publishInfo=" + publishInfo;
	}
	
}
