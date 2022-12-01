//Method
        /*We create method inside main. the method name must have () next to it.
        *static means that the method belongs to the Main class and not an object of the Main class.
        *void means that this method does not have a return value.
        * example:
        * public class Main {
               static void myMethod() {
                // code to be executed
         }
      }
      * A method can also be called multiple times:

*/
public class method {
  /* example 1 method
    static void myMethod(){
        System.out.println("how are you?");
    }
    public static void main(String[] args){
    myMethod();

    }

    }*/
//method Parameters and Arguments
/*Information can be passed to methods as parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.*/
    static void myMethod(String fName){
        System.out.println(fName + " Ahmed");
    }
    public static void main(String[] args){
// fName is a parameter and Sumeya, Maya and Sabrin are arguments.
        myMethod("Sumeya");
        myMethod("maya");
        myMethod("Sabrin");

    }
}
//multiple parameter
//Note that when you are working with multiple parameters,
//the method call must have the same number of arguments as there are parameters,
//and the arguments must be passed in the same order.

/* static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Sumeya", 21);
    myMethod("Maya", 2);
    myMethod("Sabrin", 31);
  }
}*/
