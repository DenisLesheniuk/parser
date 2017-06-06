package ml.ledv.fb2parser.model.book;

public class Author {
	private String firstName = "";
	private String middlleName = "";
	private String lastName = "";
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlleName() {
		return middlleName;
	}
	public void setMiddlleName(String middlleName) {
		this.middlleName = middlleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "\nfirstName=" + firstName + "\n middlleName=" + middlleName + "\n lastName=" + lastName;
	}
}
