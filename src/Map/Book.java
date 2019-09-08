
package Map;
public class Book 
{
	  private int id;
	  private String name;
	  private String author;
	  private static int idGenerator = 101;
	  
	 public Book()
	  {
		  id = idGenerator++;
	  }
	 public Book(String name, String author)
	  {
		  this();
		  this.name = name;
		  this.author = author;
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
	  public String getauthor() 
	  {
		return author;
	  }
	  public void setauthor(String author) 
	  {
		this.author = author;
	  }
	  public String toString()
	  {
		  return "id = " +id+ ", name = " +name+ ",author = " +author;
	  }
}