package inheritance;

import java.util.LinkedList;

public class Theater {

    LinkedList movies = new LinkedList();
    LinkedList list = new LinkedList();
    LinkedList movieList = new LinkedList();
    int average = 0;
    int starCount = 0;
    public String name;
    int theaterReviewcount;
    int movieReviewCount;


    public Theater(String name){
        this.name = name;
        this.movies = movies;
        this.average = average;

    }

//Review for theater
    public int addReview(Review review){

        list.add(review);
        starCount+=  review.stars;
        average = starCount / list.size();
        return average;

    }
    public void addReviewMovie(MovieReview review){

        movieList.add(review);

        movieReviewCount++;
    }


    public void addMovie(String movie){

        list.add(movie);
        theaterReviewcount++;

    }

    public void delMovie(String movie){

        list.remove(movie);
        theaterReviewcount--;
    }

    public void printMovies(){

        Object[] movies = list.toArray();

        for(int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);

        }

    }


    public String toString(Theater theater){
        String str = theater.name + " Average Stars: " + theater.average;

        return str;
    }





}
