public class Triangle {

	private Point v1;
	private Point v2;
	private Point v3;

	public Triangle(Point x, Point y, Point z) {

		v1 = x;
		v2 = y;
		v3 = z;
	}

	public Triangle(double v1x , double v1y , double v2x , double v2y , double v3x, double v3y) {

		Point v1 = new Point(v1x,v1y);
		Point v2 = new Point(v2x,v2y);
		Point v3 = new Point(v3x,v3y);
	}

	public double getPerimeter() {

		double L1 = v1.distanceTo(v2);
		double L2 = v2.distanceTo(v3);
		double L3 = v3.distanceTo(v1);

		return L1 + L2 + L3;
		
	}


	public Point getVertex(int index) {

		if (index == 0) {

			return v1;
		}

		if (index == 1) {

			return v2;

		}

		else if (index == 2) {

			return v3;
	
		}

		return v1;

	}

	public void setVertex(int index, Point newP) {

		if (index == 0) {

			v1 = newP;
		}

		if (index == 1) {

			v2 = newP;
		}

		else if (index == 2) {

			v3 = newP;
		}

	}

	public String toString() {

		return "Triangle : A(" + v1.getX() + "," + v1.getY() + ") B(" + v2.getX() + "," + v2.getY() + ") C(" + v3.getX() + "," + v3.getY() + ")";
	}

}
