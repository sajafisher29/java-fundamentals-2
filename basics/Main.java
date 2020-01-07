
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int dogCount = 2;
        int catCount = 1;
        String dog = "dog";
        String cat = "cat";

        System.out.println("I have " + dogCount + " " + pluralize(dog, dogCount));
        System.out.println("I have " + catCount + " " + pluralize(cat, catCount));
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

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            // System.out.println(random);
            if (random < .5) {
                result[i] = "tails";
            } else {
                result[i] = "heads";
            }
        }
        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }
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