/**
 * this class represents Triangle with 3 Point in a Cartesian Coordinate 
 * @author Shimon hagag
 *
 */
public class Triangle implements Drawable {
	private Point p1,p2,p3;
/**
 * Constructor and initializes Triangle 		
 * @param a Point 
 * @param b	Point
 * @param c Point
 */
	public Triangle(Point a,Point b ,Point c){
		this.p1= new Point(a);
		this.p2= new Point(b);
		this.p3= new Point(c);

	}
	/**
	 * Copy Constructor Triangle
	 * @param t Triangle
	 */
	public Triangle(Triangle t){
		this(t.p1,t.p2,t.p3);
	}

	/**
	 * Checking if the Drawable is a triangle and return ture if is equals 
	 * @param d is a Shape that implements Drawable
	 * @return true or false 
	 */		
	@Override 
	public boolean equals(Drawable d) {
		if(d instanceof Triangle){
			if(this.p1.equals(((Triangle) d).p1)&&this.p2.equals(((Triangle) d).p2)&&this.p3.equals(((Triangle) d).p3)){
				return true;
			}
			else{return false;}
		}
		else{return false;}
	}

	/**
	 * return the perimeter of the triangle
	 * @return (Double)
	 */
	@Override	
	public double perimeter() {
		return p1.Distance(p2)+p2.Distance(p3)+p3.Distance(p1);
	}
	/**
	 * function that calculate the area of triangle
	 * @return (double)
	 */
	@Override
	public double area(){
		double p=perimeter()/2;
		return 	Math.pow(p*(p-p1.Distance(p2))*(p-p2.Distance(p3))*(p-p1.Distance(p3)), 0.5);
	}
	/**
	 * translate the point of the Triangle
	 * @param p p is a Point
	 */
	@Override
	public void translate(Point p) {
		// TODO Auto-generated method stub
		this.p1.translate(p);
		this.p2.translate(p);
		this.p3.translate(p);

		
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
	 * @return p3
	 */
	public Point p3(){
		return this.p3;
	}
	/**
	 * check if the triangle contains the Point 
	 * @param p Point
	 * @return true/false 
	 */
@Override
public boolean contains(Point p) {
	Triangle t1 = new Triangle(p,this.p1,this.p2);
	Triangle t2 = new Triangle(p,this.p1,this.p3);
	Triangle t3 = new Triangle(p,this.p3,this.p2);
	return Math.abs((this.area() - (t1.area()+t2.area()+t3.area()))) <=0.005;	
}
	
	

}
