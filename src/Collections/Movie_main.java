package Collections;
import java.util.ArrayList;
import java.util.List;
public class Movie_main {
		public static void main(String [] args)
		{
			//create a list
		 List <Movie>MovieList= new ArrayList<Movie>();
		 MovieList.add(new Movie("AAA", "suchrita ", 34.30 , 4 ));
		 MovieList.add(new Movie("BBB", "shikha ", 40.50 , 5 ));
		 MovieList.add(new Movie("CCC", "vidya ", 45.09 , 2 ));
		 
		 for (Movie m: MovieList)
		 {
			 System.out.print(m.getMovie_name()+ " ");
			 System.out.println(m.getRating());
		 }
   }
}

