//Write java code that define radius for a circle and print the circumference, diameter and
//area for the circle
class Circle{
	public static void main(String[] args){
		float radius=2.5f;
		double circumference=2*3.14*radius;
		double diameter=2*radius;
		double area=3.14*radius*radius;
		System.out.println("Radius of circle is ="+radius);
		System.out.println("Circumference of circle is ="+circumference);
		System.out.println("Diameter of circle is ="+diameter);
		System.out.println("Area of circle is ="+area);
	}
}