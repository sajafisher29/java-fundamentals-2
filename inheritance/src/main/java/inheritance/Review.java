package inheritance;

public class Review {

    public String body;
    public String author;
    public int stars;
    public String movie;


    public Review(String body, String author, int stars){
        this.body = body;
        this.author= author;
        this.stars = stars;


    }

    public String toString(Review test){
        String str = test.body + " " + test.author +  " " + test.stars;

        return str;
    }


}
