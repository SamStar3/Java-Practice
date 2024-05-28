package Polymorphism;

import java.util.Scanner;

public class MovieMain {

  public static void main(String[] args) {
//      Movie movie = new Adventure("Star wars");
//      movie.watchMovie();

//      Movie theMovie = Movie.getMovie("Adventure","Star Wars");
//      theMovie.watchMovie();

      Scanner sc = new Scanner(System.in);
      while(true) {
          System.out.println("Enter type (A for Adventure, C for Comedy, S for Science Fiction, or Q for quit): ");
          String type = sc.nextLine();
          if("Qq".contains(type)){
              break;
          }

          System.out.println("Enter Movie Title: ");
          String title = sc.nextLine();
          Movie theMovie = Movie.getMovie(type,title);
          theMovie.watchMovie();
      }
  }
}
