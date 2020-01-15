package inheritance;

import java.util.LinkedList;

public class Shop {


    LinkedList list = new LinkedList();
    public String name;
    public int stars;
    public String price;
    int starCount = 0;
    int average = 0;


    public Shop(String name, String price){
        this.name = name;
        this.stars = average;
        this.price = price;

    }


    public int addReview(Review review){

        list.add(review);
        starCount+=  review.stars;
        average = starCount / list.size();
        return average;

    }


    public String toString(Shop shop){
        String str = shop.name + " Average Stars: " + shop.average +  " Price: " + shop.price;

        return str;
    }

}
