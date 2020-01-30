package TheValidateThing;

public class ItTeacher extends Thing{
	//Attributes
	private int yearsOfExperience;
//	private boolean isBackBreakWorking;
	
	//Constructor
	public ItTeacher(String name, int yearsOfExperience, boolean isBackBreakWorking){
		super(name);
		this.yearsOfExperience = yearsOfExperience;
//		this.isBackBreakWorking = isBackBreakWorking;
	}

	@Override
	public boolean isValid() {
		if(yearsOfExperience > 2) {
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