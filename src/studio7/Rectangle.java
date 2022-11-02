/**
 * This is because the file Rectangle.java is in the studio 7 package
 */
package studio7;

/**
 * @author levimattison
 * Since this assignment is focused on rectangles, their dimensions (height, base), areas,
 * and perimeters, the class is called Rectangles.
 */
public class Rectangle {

	/**
	 * this is because the base is a base
	 */
	private int base;
	/**
	 * this is because the height is a height
	 */
	private int height;
	
	/**
	 * @param realBase
	 * @param realHeight
	 * 
	 */
	public Rectangle(int realBase, int realHeight) {
		base = realBase;
		height = realHeight;
	}
	
	public int baseReturn() {
		return this.base;
	}
	
	public int heightReturn() {
		return this.height;
	}
	
	public void setBase(int realBase) {
		base = realBase;
	}
	
	public void setHeight(int realHeight) {
		height = realHeight;
	}
	
	public int Area() {
		return this.base * this.height;
	}
	
public int Perimeter() {
		return 2 * this.base + 2 * this.height;
	}
	
	public boolean SquareOrNot() {
		if (this.base == this.height) {
			return true;
		}
		return false;
	}
	
	public static void print(int RectA_area, int RectB_area, int RectA_perimeter, int RectB_perimeter, boolean SquareOrNot) {
		System.out.println("Rectangle A Area: " + RectA_area);
		System.out.println("Rectangle B Area: " + RectB_area);
		System.out.println("Rectangle A Perimeter: " + RectA_perimeter);
	System.out.println("Rectangle B Area: " + RectB_perimeter);
		System.out.println("Rectangle A Is Bigger? " + SquareOrNot);
	}
	
	public static void main(String[] args) {
		Rectangle rectangleA = new Rectangle(2, 1);
		Rectangle rectangleB = new Rectangle(1, 1);
	int RectA_area = rectangleA.Area();
	int RectB_area = rectangleB.Area();
		int RectA_perimeter = rectangleA.Perimeter();
		int RectB_perimeter = rectangleB.Perimeter();
		
	boolean SquareOrNot = RectA_area > RectB_area;
		print(RectA_area,RectB_area,RectA_perimeter,RectB_perimeter,SquareOrNot);
	}

}
