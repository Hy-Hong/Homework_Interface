package The_regular_polygon;

public abstract class Rid implements RegularPolygon{

	int lenght;
	public Rid(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public int getSideOfLength() {

		return lenght;
	}
}
