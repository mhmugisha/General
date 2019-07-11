package variousExamples;

class Rectangle {
	double width;
	double height;

	double area() {
		return width * height;
	}

	void setDim(double w, double h) { // Method with parameters
		width = w;
		height = h;
	}
}

public class Main1 {

	public static void main(String args[]) {
		Rectangle mybox1 = new Rectangle();
		double vol;
		mybox1.setDim(10, 20);

		vol = mybox1.area();
		System.out.println("Area is " + vol);

	}

}
