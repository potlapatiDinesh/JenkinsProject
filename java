enum Size{

  // enum constants
  SMALL, MEDIUM, LARGE, EXTRALARGE;

  public String getSize() {

  // this will refer to the object SMALL
  switch(this) {
    case SMALL:
      return "small";

    case MEDIUM:
      return "medium";

    case LARGE:
      return "large";

    case EXTRALARGE:
      return "extra large";

    default:
      return null;
     }
  }

  public static void main(String[] args) {

     // call the method getSize()
     // using the object SMALL
     System.out.println("The size of Pizza I get is " + Size.SMALL.getSize());

     // call the method getSize()
     // using the object LARGE
     System.out.println("The size of Pizza I want is " + Size.LARGE.getSize());
  }
}

I have made changes this is the final code you can commit it im going to modift the code
[200~public class Main {
  public static void main(String[] args) {
    long myNum = 15000000000L;
    System.out.println(myNum);  
  }
}

public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);
    }

