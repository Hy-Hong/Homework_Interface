package TheValidateThing;

public class Bike extends Thing{
	//Attributes
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;
	
	//Constructors
	public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking){
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}

	@Override
	public boolean isValid() {
		if(age < 2 && (isBackBreakWorking || isFrontBreakWorking)) {
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
			message = super.toSting() +  " Invalid ";
		}
		return message;
		
	}
	
}
