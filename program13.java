package pro1;
class Shape{
	public int area(int side) {
		System.out.println("I am Square");
		return side*side;
	}
	public int area(int l, int b) {
		System.out.println("I am Rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("I am Circle");
		return 3.14f*radius*radius;
	}
}
public class program13 {
	public static void main(String[] args) {
		Shape shape = new Shape();
		int rectangleArea = shape.area(5, 6);
		System.out.println("Area of rectangle:"+rectangleArea);
		int squareArea = shape.area(5);
		System.out.println("Area of square:"+squareArea);
		float circleArea = shape.area(6.5f);
		System.out.println("Area of circle:"+circleArea);
	}

}
