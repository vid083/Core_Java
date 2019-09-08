package Static_keyword;

public class Student1 {
	private int id;
	private String name;
	private float chem;
	private float phy;
	private float maths;
	private static int idGenerator = 1;
	
	Student1(){
		id = idGenerator++;
	}
	
	Student1(String name, float chem, float phy, float maths){
		this();
		this.name = name;
		this.chem = chem;
		this.phy = phy;
		this.maths = maths;
				}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getChem() {
		return chem;
	}

	public void setChem(float chem) {
		this.chem = chem;
	}

	public float getPhy() {
		return phy;
	}

	public void setPhy(float phy) {
		this.phy = phy;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}


	public double calculatePercentage(){
		return (chem + phy + maths)/3;
	
	}
	
	public static Student1 Compare(Student1 s1, Student1 s2){
		
		if(s1.calculatePercentage() > s2.calculatePercentage()){
			return s1;
		}
		return s2;
		
	}
	
	public String toString(){
		return "id = " + id + ", Name = " + name + ",chem = " +chem + ",phy = " +phy + ",maths = " +maths + ", Percentage = " +calculatePercentage();
	}

}
