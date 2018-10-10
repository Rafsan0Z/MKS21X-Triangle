public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

	public double distance(Point P1, Point P2) {
		double p1x = P1.x;
		double p1y = P1.y;
		double p2x = P2.x;
		double p2y = P2.y; 

		double Part1 = Math.abs((p1x - p2x)*(p1x - p2x));
		double Part2 = Math.abs((p1y - p2y)*(p1y - p2y));

		double total = Math.sqrt(Part1 + Part2);
		return total;
	}

	public double distanceTo(Point P2) {

		double p1x = this.x;
		double p1y = this.y;
			
		Point P1 = new Point(p1x,p1y);
		return distance(P1,P2);
	}
}
