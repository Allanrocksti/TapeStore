package classes;

public class Tape {

	public enum Type {
		normal, launch, childlike
	}

	private String title;
	private Type idPrice;

	public Tape(String title, Type idPrice) {
		this.title = title;
		this.idPrice = idPrice;
	}
	
	public String getTitle() {
		return title;
	}

	public Type getIdPrice() {
		return idPrice;
	}

	public void setIdPrice(Type idPrice) {
		this.idPrice = idPrice;
	}

}
