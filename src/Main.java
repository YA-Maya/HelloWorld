import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //this is primitive types in a Variables
        //primitive types store simple values

        //byte
        byte age= 21;
        System.out.println(age);

        //int
        int viewCount = 123_456_789;
        System.out.println(viewCount);

        //string
        String name ="Maya";
        System.out.println(name);

        //long
        long number = 123_456_789_1011L;
        System.out.println();

        //float
        float price = 10.99F;
        System.out.println(price);

        //char
        char letter = 'A';
        System.out.println(letter);

        //boolean
        boolean isEligible = true;
        System.out.println(isEligible);

        // this is comments
/*this is a comments
hey
 */

        //REFERENCE TYPES
        Date now = new Date();
        System.out.println(now);

/* y is not affected because x and y are independent of each other*/
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
/*but when we use reference type there behavior is different*/
        Point point1 = new Point();
        Point point2 = point1;







    }
}

