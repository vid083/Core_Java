package Classes_and_Objects;

public class Triangle {
	private float side1;
	private float side2;
	private float side3;
	
protected Triangle(){
		
	}
	protected Triangle (float side1, float side2, float side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
		protected double getArea (){
			float S = (side1 + side2 + side3)/2;
			double area = Math.sqrt(S * (S-side1) * (S-side2) * (S-side3));
		return area;	
		}
		
		public String toString(){
			return "side1 : " +side1 + ",side2 :" +side2+ ",side3 : " +side3+ ",area = " +getArea();
		}
}
		
		
	