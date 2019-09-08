package inheritance;

public class A_superClass {
	
	private int i;
	
	public A_superClass(){
		System.out.println("Super class constructor");
	}
	
	public void setI(int i){
		this.i = i;
	}
	public int getI(){
		return i;
	}
	
	public int add(){
		return i + 5;
	}

}
