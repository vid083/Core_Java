package Collections;

public class StudentSort implements Comparable<StudentSort> 
	{
		  private int id;
		  private String name;
		  private int marks;
		  private int age;
		  private long phone;
		  private static int idGenerator = 101;
		  
		 public StudentSort ()
		  {
			  id = idGenerator++;
		  }
		 public StudentSort (String name, int marks, int age, long phone)
		  {
			  this();
			  this.name = name;
			  this.marks = marks;
			  this.age = age;
			  this.phone = phone;
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
		  public int getmarks() 
		  {
			return marks;
		  }
		  public void setmarks(int marks) 
		  {
			this.marks = marks;
		  }
		  public int getage() 
		  {
			return age;
		  }
		  public void setage(int age)
		  {
			this.age = age;
		  }
		  public long getphone()
		  {
			return phone;
		  }
		  public void setphone(long phone)
		  {
			this.phone = phone;
		  }
		  public String toString()
		  {
			  return "id = " +id+ ", name = " +name+ ",marks = " +marks+", age = " +age+ ", phone = " +phone;
		  }
		 
		@Override
		public int compareTo(StudentSort s) {
			// TODO Auto-generated method stub
			if(marks > s.getmarks())
				return -1;
				  else if (marks < s.getmarks())
					  return 1;
			
			/* if(marks > s.getage())
				return 1;
				  else if (marks < s.getage())
					  return -1;
				  return 0;*/
				  
				//return name.compareTo(s.getname());
				  return 0;
			
		}
	}


