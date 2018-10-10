public class Triangle {

	private Point[] Triangle  = new Point[2];

	public Triangle(Point x, Point y, Point z) {

		Triangle[0] = x;
		Triangle[1] = y;
		Triangle[2] = z;
	}

	public Triangle(double P1x , double P1y , double P2x , double P2y , double P3x, double P3y) {

		Point P1 = new Point(P1x,P1y);
		Point P2 = new Point(P2x,P2y);
		Point P3 = new Point(P3x,P3y);

		Triangle[0] = P1;
		Triangle[1] = P2;
		Triangle[2] = P3;
	}

	public double getPerimeter() {

	}

	public Point getVertex(int index) {

	}

	public void setVertex(int index, Point newP) {

	}

}
