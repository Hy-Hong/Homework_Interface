package The_regular_polygon;

public class EquilateralTriangle extends Rid{
	
	
	public EquilateralTriangle(int lenght) {
		super(lenght);
	}

	public final int DEAFAULT_SIDE = 3;

	@Override
	public int getNumSides() {
		return DEAFAULT_SIDE;
		
	}

}
