import java.util.ArrayList;
/**
 * Container of Shape that implements Drawable
 * @author Shimon Hagag
 *
 */
public class ShapeContainer {
	public ArrayList<Drawable> ArryofShape;
	public int size_t=0,size_r=0;
	
	
	/**
	 * Constructor and initializes ShapeContainer
	 *  		
	 */
	public ShapeContainer(){
		this.ArryofShape=new ArrayList<Drawable>();		
	}
	/**
	 * deep copy constructor
	 * @param other ShapeContainer
	 */
	public ShapeContainer(ShapeContainer other){
		this.ArryofShape= new ArrayList<Drawable>();
		for(int i=0;i<other.ArryofShape.size();i++){
			if(other.ArryofShape.get(i) instanceof Triangle) {
			this.add(new Triangle((Triangle)other.ArryofShape.get(i)));
			}else {
			this.add(new Rectangle((Rectangle)other.ArryofShape.get(i)));
			}
				
		}
		
	}
	/**
	 * add the given object to the container
	 * @param d is a Shape that implements Drawable
	 */
	public void add (Drawable d){
		if(d instanceof Triangle) {			
			size_t++;
			}else {
			size_r++;
			}
		ArryofShape.add(d);
	}

 	 /**
 	  * @return the number of stored shapes in the container
 	  */
	public int size(){
		return this.ArryofShape.size();
	}
	 /**
	  * @return the number of stored triangles in the container
	  */
	public int T_size(){		
		return this.size_t;
	}
	 /**
	  *  @return the number of stored rectangles in the container
	  */
	public int R_size(){	
		return this.size_r;
	}
	/**
	 * remove triangles & rectangles containing p
	 * @param p Point
	 */
	public void remove(Point p) 
	{
		for(int i=0;i<this.size();i++){
			if(ArryofShape.get(i).contains(p)){
				if(ArryofShape.get(i) instanceof Triangle)
				{
					size_t--;
					
				}
				else{
					size_r--;					
					}
				this.ArryofShape.remove(i);
				i--;		
			}
		}

		}

/**
 * @param i Index
 * @return a new copy of the triangle number i
 */
	public Triangle T_at(int i) 
	{		
		int temp=0;
		for(int j=0;j<this.size();j++) {
			if(ArryofShape.get(j) instanceof Triangle) {				
				if(temp==i) {
					return new Triangle((Triangle)ArryofShape.get(j));
				}
				temp++;
			}
		}
		return null;
	}
/**
 * @param i Index
 * @return a new copy of the rectangle number i
 */
	public Rectangle R_at(int i) 
	{
		int temp=0;
		for(int j=0;j<this.size();j++) {
			if(ArryofShape.get(j) instanceof Rectangle) {
				
				if(temp==i) {
					return new Rectangle((Rectangle)ArryofShape.get(j));
				}
				temp++;
			}
		}
		return null;		
	}
/**
 * @return the sum of the areas of all the triangles & rectangles
 */
	public double sumArea() 
	{
		double sumarea=0;
		for(int i=0;i<this.size();i++){
			sumarea=sumarea+ArryofShape.get(i).area();
		}
		return sumarea;
				
	}
	public void translate(Point p){
		for(int i=0;i<this.ArryofShape.size();i++){							
			ArryofShape.get(i).translate(p);
	}
	}	
	}
	

	
	

