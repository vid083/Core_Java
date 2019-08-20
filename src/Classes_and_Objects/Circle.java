package Classes_and_Objects;

public class Circle {
		
		float radius;
		
		void area(){
		float area = (float) (3.14 * radius * radius);	
		System.out.println("Area of circle: " +area);
		}
		void perimeter(){
		float perimeter = (float) (2 * 3.14 * radius);
		System.out.println("Perimeter of  circle: " +perimeter);
		
	}

}
