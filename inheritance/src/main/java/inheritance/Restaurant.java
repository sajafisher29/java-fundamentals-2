package inheritance;

import java.util.LinkedList;

public class Restaurant {

    LinkedList list = new LinkedList();
    //should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).

    public String name;
    public int stars;
    public String price;
    int starCount = 0;
    int average = 0;



    public Restaurant(String name, String price){
        this.name = name;
        this.stars = average;
        this.price = price;

    }


    //add review also updats average star count
    public int addReview(Review review){

                list.add(review);
              starCount+=  review.stars;
                average = starCount / list.size();
        return average;

    }

    public String toString(Restaurant restaurant){
        String str = restaurant.name + " Average Stars: " + restaurant.average +  " Price: " + restaurant.price;

        return str;
    }


}
