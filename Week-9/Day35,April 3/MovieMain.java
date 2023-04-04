import java.util.ArrayList;
import java.util.*;

class Movie implements Comparable<Movie>{
  String name;
  String director;
  int year;

  public Movie(String name,String director,int year){
    this.name=name;
    this.director=director;
    this.year=year;
  }
  public int compareTo(Movie mo){
    if(year>mo.year){
      return -1;
  
    }
    else if(year<mo.year){
      return 1;
    }
    else{
      return 0;
    }
  }
}
    class MovieMain{
      public static void main(String args[]){
        ArrayList<Movie> movies=new ArrayList<Movie>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
          movies.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
        }
        Collections.sort(movies);
        for(Movie mo:movies){
          System.out.println(mo.name+""+mo.director+""+mo.year);
        }
        
        
      }
    }
  
