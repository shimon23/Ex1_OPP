/**
* this class represents a 2d point in the plane. <br>
* supports several operations on points in the plane.
*/
public class Point implements Drawable{

// ******** private data ********
	private double _x, _y;
	
// ********* constructors ********
   public Point (double x1, double y1) {
      _x = x1;
      _y = y1;
   }
   
 /** copy constructor:  
       1)here a direct access to a class memeber is performed,
         this will be done only in a constractor to achieve an identical copy
       2) using a call to another constractor code is not written twice
       */  
   public Point (Point p) { this(p._x, p._y);}
 
    // ********** public methodes *********
   public double x() {return _x;}
   public double y() {return _y;}
   
   public void setx(double x){
	   this._x= x;
   }
   public void sety(double y){
	   this._y= y;
   }

   /** @return a String contains the Point data*/
   public String toString()  {
      return "name: " + this.getClass() +"[" + _x + "," + _y+"]";
   }

   /**    logical equals 
   @param p other Object (Point).
   @return true iff p instance of Point && logicly the same) */
   public boolean equals (Point p) {
   	  return p!=null && p._x == _x && p._y==_y; }
  //Distance Between 2 Points
   public double Distance(Point p){

	   return Math.sqrt(Math.pow(this._x-p._x,2)+Math.pow(this._y-p._y,2));
   }
//   public double Distance(){
//
//	   return Math.sqrt(Math.pow(this._x,2)+Math.pow(this._y,2));
//   }
	



public boolean equals(Drawable d) {
	// TODO Auto-generated method stub
	if(d instanceof Point){
		if(this._x==((Point) d).x()&&this._y==((Point)d).y()){
			return true;
		}
		else{ return false;}
	}
	else{
	return false;}
}

public void translate(Point p) {
	// TODO Auto-generated method stub
	this._x=this._x+p.x();
	this._y=this._y+p.y();
}

@Override
public boolean contains(Point p) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public double perimeter() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double area() {
	// TODO Auto-generated method stub
	return 0;
}

}// class Point