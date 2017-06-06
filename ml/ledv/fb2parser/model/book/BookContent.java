package ml.ledv.fb2parser.model.book;

public class BookContent {
	private String content;

	public BookContent() {
		this.content = "";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BookContent content=" + content;
	}
}
