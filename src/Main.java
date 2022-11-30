import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

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
      //  Point point1 = new Point(x:1, y:1);
       // Point point2 = point1;

//Strings
        String message = "i love apples";
        System.out.println(message);
// Concatenation
        String message1 = "i love apples"+ "!";
        System.out.println(message1 +"!");

        //indexOf
        String message2 = "i love apples"+ "!";
        System.out.println(message2.indexOf("e"));
//replace
        String message3 = "i love apples"+ "!";
        System.out.println(message3.replace("!", "*"));
//Length
        System.out.println(message3.length());

//uppercase
        System.out.println(message2.toUpperCase());

//lowercase
        System.out.println(message3.toLowerCase());

//escapes sequences
     String message4 = "Hey \"Sumeya\"";
        System.out.println(message4);
/*you can use \' for single quote
\" for double quote
\\for backslash*/

//Arrays

}
public static void arrays(){
int[] number= new int[5];
number[0]=1;
number[1]=2;


    System.out.println( Arrays.toString(number));
































   }
}

