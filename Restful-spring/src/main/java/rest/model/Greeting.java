package rest.model;

public class Greeting {

	public Greeting() {}
	
	public Greeting(String id, String quote) {
		this.id = id;
		this.quote = quote;
	}
	private String id;
	private String quote;
	
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", quote=" + quote + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	
}
