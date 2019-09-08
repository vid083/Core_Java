// Create movie objects which will have name, director_name, duration, rating. Later put these objects in HashSet.
package Collections;

public class Movie {
	  
	  private String movie_name;
	  private String director_name;
	  private double duration;
	  private float rating;
	  
	 public Movie()
	  {
		  
	  }
	 public Movie(String movie_name, String director_name, double duration, float rating)
	  {
		  this();
		  this.movie_name = movie_name;
		  this.director_name = director_name;
		  this.duration = duration;
		  this.rating = rating;
	  }
	  public String getMovie_name() 
	  {
		return movie_name;
	  }
	  public void setMOvie_name(String Movie_name) 
	  {
		this.movie_name = movie_name;
	  }
	  public String getDirector_name() 
	  {
		return director_name;
	  }
	  public void setDirector_name(float Director_name) 
	  {
		this.director_name = director_name;
	  }
	  public double getDuration() 
	  {
		return duration;
	  }
	  public void setDuration(float Duration)
	  {
		this.duration = duration;
	  }
	  public double getRating() 
	  {
		return rating;
	  }
	  public void setRating(float Rating)
	  {
		this.rating = rating;
	  }
	  public String toString()
	  {
		  return  "movie_name = " +movie_name+ ",director_name = " +director_name+ ", duration = " +duration+ ", rating = " +rating; 
	  }
	}
