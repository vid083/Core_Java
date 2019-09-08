package Collections;
public class Student 
{
  private int id;
  private String name;
  private float chem;
  private float phy;
  private float maths;
  private static int idGenerator = 101;
  
 public Student()
  {
	  id = idGenerator++;
  }
 public Student(String name, float chem, float phy, float maths)
  {
	  this();
	  this.name = name;
	  this.chem = chem;
	  this.phy = phy;
	  this.maths = maths;
  }
  public int getId() 
  {
   return id;
  }
  public void setId(int id)
  {
	this.id = id;
  }
  public String getName() 
  {
	return name;
  }
  public void setName(String name) 
  {
	this.name = name;
  }
  public float getChem() 
  {
	return chem;
  }
  public void setChem(float chem) 
  {
	this.chem = chem;
  }
  public float getPhy() 
  {
	return phy;
  }
  public void setPhy(float phy)
  {
	this.phy = phy;
  }
  public float getMaths()
  {
	return maths;
  }
  public void setMaths(float maths)
  {
	this.maths = maths;
  }
  protected double Percentage()
  {
		return (chem + phy + maths)/3;
  }
  public String toString()
  {
	  return "id = " +id+ ", name = " +name+ ",chemistry = " +chem+ 
		", physicls = " +phy+ ", maths = " +maths+ ", Percentage = " +Percentage();
  }
}
