package The_regular_polygon;

import java.util.ArrayList;

public interface RegularPolygon {
	//Methods
	public int getNumSides();
	public int getSideOfLength();
	
	public static int getTotalSides(ArrayList<RegularPolygon> array) {
		int sum = 0;
		for (RegularPolygon regularPolygon : array) {
			sum += regularPolygon.getNumSides();
		}
		return sum;
	}
}
