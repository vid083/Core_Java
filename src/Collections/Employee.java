package Collections;
public class Employee 
{
	  private int id;
	  private String name;
	  private double salary;
	  private static int idGenerator = 101;
	  
	 public Employee()
	  {
		  id = idGenerator++;
	  }
	 public Employee(String name, double salary)
	  {
		  this();
		  this.name = name;
		  this.salary = salary;
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
	  public double salary() 
	  {
		return salary;
	  }
	  public void setsalary(double salary)
	  {
		this.salary = salary;
	  }
	  public String toString()
	  {
		  return "id = " +id+ ", name = " +name+ ",salary = " +salary;
	  }
}