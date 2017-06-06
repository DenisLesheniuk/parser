package ml.ledv.fb2parser.core;

public class FictionBookDescriptionTags {
	private boolean genre = false;
	private boolean bookTitle = false;
	private boolean annotation = false;
	private boolean authorFirstName = false;
	private boolean authorLastName = false;
	private boolean authorMiddleName = false;
	private boolean publishInfoBookName = false;
	private boolean publishInfoPublisher = false;
	private boolean publishInfoCity = false;
	private boolean publishInfoYear = false;
	private boolean publishInfoIsbn = false;
	private boolean p = false;
	private boolean titleInfo = false;
	private boolean author = false;
	
	
	public boolean isAuthor() {
		return author;
	}
	public void setAuthor(boolean author) {
		this.author = author;
	}
	public boolean isTitleInfo() {
		return titleInfo;
	}
	public void titleInfo(boolean titleInfo) {
		this.titleInfo = titleInfo;
	}
	public boolean isP() {
		return p;
	}
	public void setP(boolean p) {
		this.p = p;
	}
	public boolean isGenre() {
		return genre;
	}
	public void setGenre(boolean genre) {
		this.genre = genre;
	}
	public boolean isBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(boolean bookTitle) {
		this.bookTitle = bookTitle;
	}
	public boolean isAnnotation() {
		return annotation;
	}
	public void setAnnotation(boolean annotation) {
		this.annotation = annotation;
	}
	public boolean isAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(boolean authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public boolean isAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(boolean authorLastName) {
		this.authorLastName = authorLastName;
	}
	public boolean isAuthorMiddleName() {
		return authorMiddleName;
	}
	public void setAuthorMiddleName(boolean authorMiddleName) {
		this.authorMiddleName = authorMiddleName;
	}
	public boolean isPublishInfoBookName() {
		return publishInfoBookName;
	}
	public void setPublishInfoBookName(boolean publishInfoBookName) {
		this.publishInfoBookName = publishInfoBookName;
	}
	public boolean isPublishInfoPublisher() {
		return publishInfoPublisher;
	}
	public void setPublishInfoPublisher(boolean publishInfoPublisher) {
		this.publishInfoPublisher = publishInfoPublisher;
	}
	public boolean isPublishInfoCity() {
		return publishInfoCity;
	}
	public void setPublishInfoCity(boolean publishInfoCity) {
		this.publishInfoCity = publishInfoCity;
	}
	public boolean isPublishInfoYear() {
		return publishInfoYear;
	}
	public void setPublishInfoYear(boolean publishInfoYear) {
		this.publishInfoYear = publishInfoYear;
	}
	public boolean isPublishInfoIsbn() {
		return publishInfoIsbn;
	}
	public void setPublishInfoIsbn(boolean publishInfoIsbn) {
		this.publishInfoIsbn = publishInfoIsbn;
	}
}
