package inheritance;



import org.junit.Test;

import static org.junit.Assert.*;

//TEST 1 Initial test to make sure the Restaurant constructor and class are working properly
public class RestaurantTest {

    @Test public void testRestaurantClass() {

        Restaurant arbys = new Restaurant("arbys",  "$$$");

//        System.out.println(arbys.name);
//        System.out.println(arbys.stars);
//        System.out.println(arbys.price);
        String expected = "$$$" ;
        String expected2 = "arbys" ;

       // System.out.println(arbys.toString(arbys));

        assertEquals("Returns Restaurant price testing constructor", expected, arbys.price);
        assertEquals("inserted value into middle of array", expected2, arbys.name);

    }




// TEST 2 tests out toString for the Restaurant Class
    @Test public void testToString() {

        Restaurant arbys = new Restaurant("arbys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
            arbys.addReview(test);
            arbys.addReview(test1);
String expected = "arbys Average Stars: 4 Price: $$$";
        System.out.println(arbys.toString(arbys));


       assertEquals("Tests Restaurant Class toStirng method", expected, arbys.toString(arbys));


    }


    //TEST 3 tests the Review class and the ToString method
    @Test public void testReviewToString() {

        Review test = new Review("This place is awesome!", "Peter", 5);

        System.out.println(test.toString(test));

        String expected = "This place is awesome! Peter 5";

        assertEquals("inserted value into middle of array",expected, test.toString(test) );
    }

    @Test public void testTheAddMethod() {

        Restaurant arbys = new Restaurant("arbys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 1);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 2);
        arbys.addReview(test);
        arbys.addReview(test1);
        arbys.addReview(test2);
        int expected = 2;

     assertEquals("Tests Restaurant Class addReview method", expected, arbys.average);


    }

//TEST 4 tests the average for the stars from the reviews.
    @Test public void testTheAverage() {

        Restaurant arbys = new Restaurant("arbys",  "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 4);
        arbys.addReview(test);
        arbys.addReview(test1);
        arbys.addReview(test2);
        int expected = 4;
        System.out.println(arbys.toString(arbys));


        assertEquals("tests the average for the stars from the reviews.", expected, arbys.average);


    }

//TEST 5 for the shop add method
    @Test public void testTheAddMethodShop() {

        Shop macys = new Shop("Macys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 1);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 2);
        macys.addReview(test);
        macys.addReview(test1);
        macys.addReview(test2);
        int expected = 2;

        assertEquals("Tests for the shop add method", expected, macys.average);


    }

    // TEST 6 This will test the average for the shop
    @Test public void testTheAverageStarsShop() {

        Shop macys = new Shop("Macys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 4);
        Review test1 = new Review("This place is okay!", "emily", 5);
        Review test2 = new Review("This place is cool!", "tom", 6);
        macys.addReview(test);
        macys.addReview(test1);
        macys.addReview(test2);
        int expected = 5;

        assertEquals("This will test the average for the shop", expected, macys.average);


    }

    //TEST 7 This will test the to string method for the shop
    @Test public void testToStringShop() {

        Shop zoomies = new Shop("zoomies", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
        zoomies.addReview(test);
        zoomies.addReview(test1);
        String expected = "zoomies Average Stars: 4 Price: $$$";
       // System.out.println(zoomies.toString(zoomies));
        Theater local = new Theater("home");


        local.addMovie("die hard");
        local.addMovie("die hard 2");
        local.addMovie("die hard 3");
        local.delMovie("die hard");

        local.printMovies();


        assertEquals(" This will test the to string method for the shop", expected, zoomies.toString(zoomies));


    }
    // Test 8 for theater to string
    @Test public void testToStringTheater() {


        String expected = "home Average Stars: 4";

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard 2");
        local.addMovie("die hard 3");

        System.out.println( local.toString(local));


        assertEquals("Test 8 for theater to string", expected, local.toString(local));


    }

// Test 9 for adding movie to theater through linked list

@Test public void testAddMovietoTheater() {


        int expected = 3;

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard2");
        local.addMovie("die hard3");
        local.printMovies();


        assertEquals("for adding movie to theater through linked list", expected, local.theaterReviewcount);


    }

    // Test 10 for deleting movie from movie linked list for theater
    @Test public void testDeleteMovietoTheater() {


        int expected = 2;

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard2");
        local.addMovie("die hard3");
        local.delMovie("die hard");
        local.printMovies();



        assertEquals("Tests Restaurant Class toStirng method", expected, local.theaterReviewcount);


    }
// Test 11 Test Movie Review toString
    @Test public void testMovieReviewToString() {

        MovieReview movieTest = new MovieReview("this movie was cool", 4, "die hard");
        System.out.println(movieTest.toString(movieTest));

        String expected = "Movie: die hard Review: this movie was cool Stars: 4";

        assertEquals("Test Movie Review to String",expected, movieTest.toString(movieTest) );
    }
// Test 12 Movie review linked list test
    @Test public void testMovieReviewLinkedList() {

        MovieReview movieTest = new MovieReview("this movie was cool", 4, "die hard");
        MovieReview movieTest1 = new MovieReview("this movie was okay", 3, "die hard");
        MovieReview movieTest2 = new MovieReview("this movie was lame", 1, "die hard");
        Theater regal = new Theater("regal");
        System.out.println(movieTest.toString(movieTest));
        regal.addReviewMovie(movieTest);
        regal.addReviewMovie(movieTest1);
        regal.addReviewMovie(movieTest2);

        int expected = 3;




        assertEquals("tests movie review linked list",expected, regal.movieReviewCount);
    }


}