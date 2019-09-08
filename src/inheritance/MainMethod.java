package inheritance;

public class MainMethod {
	
	public static void main( String[] args){
		B_subClass b = new B_subClass();
		b.setJ(12);
		System.out.println("J : " + b.getJ());
		b.setI(4);
		System.out.println("__________________");
		System.out.println("i : " + b.getI());
		System.out.println("sum : " + b.add());
		
	}

}
