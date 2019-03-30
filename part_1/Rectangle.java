/**
 * This class represents rectangle with 2 Point in a Cartesian Coordinate 
 * @author Shimon hagag and zohar
 *
 */
public class Rectangle implements Drawable {
	private Point p1 ,p2;
	private double dx,dy;
	
	
	/**
	 * Constructor and initializes Rectangle 
	 * @param a  Point
	 * @param b  Point
	 */
	
	public Rectangle(Point a,Point b){
		this.p1 =new Point(a);
		this.p2= new Point(b);
		this.dx=Math.sqrt(Math.pow(a.x()-b.x(), 2)); //the distance between x1 and x2 
		this.dy=Math.sqrt(Math.pow(a.y()-b.y(), 2));//the distance between y1 and y2
	}
	/**
	 * Copy Constructor Rectangle
	 * @param t Rectangle
	 */
	public Rectangle(Rectangle t){
		this(t.p1,t.p2);
	}
	
	/**
	 * Checking if the Drawable is a Rectangle and return ture if is equals 
	 * @param d d-is a Shape that implements Drawable
	 * @return true or false 
	 */		
	public boolean equals(Drawable d) {
		if(d instanceof Rectangle ){
			if(this.p1.equals(((Rectangle)d).p1())&&this.p2.equals(((Rectangle)d).p2())){
				return true;
			}else{return false;}
		}
		return false;
	}
	/**
	 * check if the Rectangle contains the Point 
	 * @param p Point
	 * @return true/false 
	 */
	@Override
	public boolean contains(Point p) {
		double maxX=Math.max(p1.x(),p2.x());
		double minX=Math.min(p1.x(),p2.x());
		double maxY=Math.max(p1.y(),p2.y());
		double minY=Math.min(p1.y(),p2.y());
		return ((minX<=p.x()&&p.x()<=maxX)&&(minY<=p.y()&&p.y()<=maxY));
	}
	/**
	 * return the perimeter of the Rectangle
	 * @return (Double)
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (this.dx+this.dy)*2;
	}
	/**
	 * function that calculate the area of Rectangle
	 * @return (double)
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.dx*this.dy;
	}
	/**
	 * translate the point of the Triangle
	 * @param p  Point
	 */
	@Override
	public void translate(Point p) {
		// TODO Auto-generated method stub
		this.p1.translate(p);		
		this.p2.translate(p);
		this.dx=Math.sqrt(Math.pow(this.p1.x()-this.p2.x(), 2)); //the distance between x1 and x2 
		this.dy=Math.sqrt(Math.pow(this.p1.y()-this.p2.y(), 2));//the distance between y1 and y2
	}
	/**
	 * @return p1
	 */
	public Point p1(){
		return this.p1;
	}
	/**
	 * @return p2
	 */
	public Point p2(){
		return this.p2;
	}
	/**
	 * @return dx
	 */
	public double dx(){
		return this.dx;
	}
	/**
	 * @return dy
	 */
	public double dy(){
		return this.dy;
	}

}
