package The_regular_polygon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<RegularPolygon> array = new ArrayList<RegularPolygon>();
		Square squar1 = new Square(0);
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(0);

		array.add(squar1);
		array.add(equilateralTriangle);
		System.out.println("Total Side of RegularPolygon is :" + RegularPolygon.getTotalSides(array));

	}

}
