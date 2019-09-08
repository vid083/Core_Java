package interfaces;

public class Interface_Demo implements Interface1 {
	final int i = 78;
	
	public void method(){
		System.out.println("Interface method");
	}
	
	public int add(int n1, int n2) {
		return n1 + n2 + n + i;
	}
	
	public int valueOfN() {
		// n=12; cannot change
		// i=8; final variables cannot reassign values
		return n;
	}

}
