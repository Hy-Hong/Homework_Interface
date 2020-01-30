package TheValidateThing;

public class RiceCooker extends Thing{
	//Attributes
	private int age;
	private int numberOfUse;
	
	//Constructors
	public RiceCooker(String name, int age, int numberOfUse) {
		super(name);
		this.age = age;
		this.numberOfUse = numberOfUse;
	}

	@Override
	public boolean isValid() {
		if(age < 5 && numberOfUse < 500) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		String message = "";
		if(isValid()) {
			message = super.toSting() + " Valid ";
		}else {
			message = super.toSting() + " Invalid ";
 		}
		return message;
	}
}
