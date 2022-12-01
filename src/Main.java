import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*Operators
+	Addition	Adds together two values	x + y
-	Subtraction	Subtracts one value from another	x - y
*	Multiplication	Multiplies two values	x * y
/	Division	Divides one value by another	x / y
%	Modulus	Returns the division remainder	x % y
++	Increment	Increases the value of a variable by 1	++x
--	Decrement	Decreases the value of a variable by 1	--x
 */

/*Assignment Operators
=	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
&=	x &= 3	x = x & 3
|=	x |= 3	x = x | 3
^=	x ^= 3	x = x ^ 3 //don't understand very well
>>=	x >>= 3	x = x >> 3 //don't understand very well
<<=	x <<= 3	x = x << 3 //don't understand very well
*/

 /*Comparison Operators
==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y */

/*Logical Operators
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)*/


//this is primitive types in a Variables
//primitive types store simple values

 //byte
        byte age = 21;
        System.out.println(age);

 //int
        int viewCount = 123_456_789;
        System.out.println(viewCount);

 //string
        String name = "Maya";
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
 *
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
        String message1 = "i love apples" + "!";
        System.out.println(message1 + "!");

//indexOf
        String message2 = "i love apples" + "!";
        System.out.println(message2.indexOf("e"));
//replace
        String message3 = "i love apples" + "!";
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
//math.round
        int result =  Math.round(1.2f);
        System.out.println(result);

//ceil
        int result1 = (int) Math.ceil(1.1f);
        System.out.println(result1);

//floor
        int result2 = (int) Math.floor(1.1f);
        System.out.println(result2);

//Math.max
        int result3 = (int) Math.max(1, 2);
        System.out.println(result3);

//Math.min
        int result4 = (int) Math.min(1, 2);
        System.out.println(result4);

 //Math.sqrt
        int result5 = (int) Math.sqrt(16);
        System.out.println(result5);

 //random
        Double result6 = Math.random()*100;//by multiply to 100 we get 0 to 100
        System.out.println(result6);

//Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        int aa = 10;
        int bb = 9;
        System.out.println(aa > bb); // returns true, because 10 is higher than 9
//if, Else if, else
        if (20 > 19){
            System.out.println("20 is greather than 18");
        }
        int time = 20;
        if (time <18) {
            System.out.println("good day");
        } else {
                System.out.println("good evening");
            }

        int height = 2;
        if (height< 1){
            System.out.println("the height is less than 1");
        } else if (height==2) {
            System.out.println("height is 2");
        }
        else {
            System.out.println("we don't know what the height is");
        }
//short hand if else
/*syntax
variable = (condition) ? expressionTrue: expressionFalse; */
//example
        int temp = 21;
        if (temp == 30){
            System.out.println("it's a hot day, Drink plenty of whater");
        } else if (temp > 20) {
            System.out.println("it's a nice day");

        }
        else {
            System.out.println("it is cold");
        }

// Switch Statements
/*switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}*/
//When Java reaches a break keyword, it breaks out of the switch block.
        int day= 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:

                System.out.println("Sunday");
                break;
        }
 //When Java reaches a break keyword, it breaks out of the switch block.
        int whenIsTheWeekend = 6;
            switch (whenIsTheWeekend) {
                        case 8:
                            System.out.println("Today is Saturdays");
                            break;
                        case 9:
                            System.out.println("Today is Sundays");
                            break;
                        default:
                            System.out.println("looking forward to the weekend");
                    }



//while loops
        int i = 0;
            while (i<3){
                System.out.println(i);
                i++;
            }

        int w = 6;

           do {
                System.out.println(w);
                w++;
            }
            while (w < 9);

//for loop
/*for (statement 1; statement 2; statement 3) {
  // code block to be executed
}*/

        //    for (int j = 0; j < 5; j++) ;{
        //        System.out.println("good morning");
        //    }

        System.out.println("");// so i can see where the code start
// Break and Continue
 //The break statement can also be used to jump out of a loop.
        for (int e= 0; e<10; e++){
            if (e==4){
                break;
            }
            System.out.println(e);
        }

//continue
/*The continue statement breaks one iteration (in the loop),
if a specified condition occurs, and continues with the next iteration in the loop.
 */
        System.out.println(""); //to see where the code below start

        for(int r= 4; r < 10; r++){
            if (r==4){
                continue;
            }
            System.out.println(r);
        }

//example in while loops
/* Break
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
continue
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

*/

//Arrays

/*Arrays are used to store multiple values in a single variable,
instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets

We have now declared a variable that holds an array of strings.
To insert values to it, you can place the values in a comma-separated list,
inside curly braces:
*/
        int[] numbers = new int[4];
        numbers[0]= 1;
        numbers[1]= 9;
        numbers[2]= 8;
        numbers[3]= 3;
        System.out.println(Arrays.toString(numbers));//this is the old way

        //the new easy way
          String[] animals = {"cars", "dogs","chicken", "pig"};
          int[] ages = {21,13,22,45};
        Arrays.sort(ages); //sort
        System.out.println(Arrays.toString(ages));//print out the arrays
        System.out.println(ages.length);//length


//You can access an array element by referring to the index number.
//This statement accesses the value of the first element in cars:
        String[]names= {"Bob", "Saacid", "Sabrin"};
        System.out.println(names[1]);

// length
        System.out.println(names.length);

        System.out.println(""); //to see where the code below start
//loops
 /*You can loop through the array elements with the for loop,
 and use the length property to specify how many times the loop should run.*/
        int[]favouriteNumber ={ 1,2,9,13};
        for (int q=0; q< favouriteNumber.length; q++){
            System.out.println(favouriteNumber[q]);
        }
/*The example above can be read like this: for each String element (called q) in favouriteNumber,
print out the value of q.
If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
it does not require a counter (using the length property), and it is more readable.*/

//Multi-Dimensional Arrays
/*A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces*/
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
/* myNumbers is now an array with two arrays as its elements.
To access the elements of the myNumbers array, specify two indexes: one for the array,
and one for the element inside that array.
This example accesses the third element (2) in the second array (1) of myNumbers:*/
        int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers1[1][2]); // Outputs 7


        int[][] number3 = new int [2][3];
        number3[0][0]=1;
        System.out.println(Arrays.deepToString(number3));

//Change Element Values

        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers2[1][2] = 9;
        System.out.println(myNumbers2[1][2]); // Outputs 9 instead of 7
//constants
        //we use 'final' so we don't change the value later on
        final float PIE = 3.14f;

//formatting number
      NumberFormat currency = NumberFormat.getCompactNumberInstance();

     String Result =  currency.format(123456789.756);
        System.out.println(Result);

//for percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        String Result1=  percent.format(0.1);
        System.out.println(Result1);
//mathods chaining
        String format = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(format);

//reading input


        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");// by getting ready of 'ln'. this will be print on the same line
        byte age4 = scanner.nextByte();// you can use next(any primitive data type)
        System.out.print("Name:");
        String name1 = scanner.nextLine().trim(); //chaining multiple methods
        System.out.println("You are "+  age4);
        System.out.println("Your name is "+name1);










//methods
/*A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.*/






















    }














   }



