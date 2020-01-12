
package basics;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int dogCount = 2;
        int catCount = 1;
        int turtleCount = 0;
        String dog = "dog";
        String cat = "cat";
        String turtle = "turtle";

        System.out.println("I have " + dogCount + " " + pluralize(dog, dogCount));
        System.out.println("I have " + catCount + " " + pluralize(cat, catCount));
        System.out.println("I have " + turtleCount + " " + pluralize(turtle, turtleCount));
        flipNHeads(5);
        clock();
    }

    public static String pluralize(String str, int num) {

        int num1 = num;
        String str1 = str;
        String s = "s";
        if (num1 == 0 || num1 > 1) {
            return (str + s);

        }

        else {
            return (str1);
        }

    }

    public static void flipNHeads(int n) {

        int count = 0;
        int totalCount = 0;
        while (count < 5){
            double random = Math.random();
            // System.out.println(random);
            if (random < .5) {
                System.out.println("tails");
                totalCount++;
            } else {
                System.out.println("heads");
                totalCount++;
                count++;
            }

        }

        System.out.println("It took " + totalCount + " flips to get " + n + " Heads");
    }

    public static void clock() {

        int i = 0;

        LocalDateTime past = LocalDateTime.now();

        while (i < 1) {
            LocalDateTime now = LocalDateTime.now();
            int second1 = past.getSecond();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            past = now;
            if (second - second1 == 1) {
                System.out.println(hour + ":" + minute + ":" + second);
            }

        }
    }

}