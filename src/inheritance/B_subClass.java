package inheritance;

public class B_subClass extends A_superClass {
	int j;
	
	public B_subClass(){
		super();
		System.out.println("Sub class Constructor");
	}
	
	public void setJ(int j){
		this.j = j;
	}
	
	public int getJ(){
		return j;
	}
	
	public int add(){
		int i = super.add();
		return i + j;
	}

}
