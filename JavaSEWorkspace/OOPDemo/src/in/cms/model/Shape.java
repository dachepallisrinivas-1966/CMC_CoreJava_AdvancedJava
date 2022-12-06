package in.cms.model;

public abstract class Shape {

	private int firstDimension;
	private int secondDimension;
	
	public Shape() {
		/* default constructor */
	}
	
	public Shape(int firstDimension, int secondDimension) {
		this.firstDimension = firstDimension;
		this.secondDimension = secondDimension;
	}

	public int getFirstDimension() {
		return firstDimension;
	}

	public void setFirstDimension(int firstDimension) {
		this.firstDimension = firstDimension;
	}

	public int getSecondDimension() {
		return secondDimension;
	}

	public void setSecondDimension(int secondDimension) {
		this.secondDimension = secondDimension;
	}
	
	public abstract int getArea();
		
}
