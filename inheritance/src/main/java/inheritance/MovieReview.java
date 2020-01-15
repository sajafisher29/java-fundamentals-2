package inheritance;

public class MovieReview{

    public String movie;
    public int stars;
    public String body;


    public MovieReview(String body, int stars, String movie){
        this.body = body;
        this.movie= movie;
        this.stars = stars;


    }

    public String toString(MovieReview test){
        String str = "Movie: " + test.movie + " Review: " + test.body +  " Stars: " + test.stars;

        return str;
    }



}