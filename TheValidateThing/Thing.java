package TheValidateThing;

public abstract class Thing implements Validable{
	//Attribute
	private String name;
	
	public Thing(String name) {
		this.name = name;
	}
	public String toSting() {
		return name;
	}
}
