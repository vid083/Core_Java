package Classes_and_Objects;

public class Circle_Main {
	public static void main(String[] args){
	//Object Creation
			Circle C = new Circle();
			C.radius = 5;
			System.out.println("radius of circle: " +C.radius);
			
			//Object.classmember
			C.area();
			C.perimeter();
}

}
