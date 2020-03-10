class varargsExample {

  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }


// Varargs overload method
static void varargOverload(boolean b, int i, int j, int k)
  {
      System.out.println("without varargs function");
  }
static void varargOverload(boolean b, int... list)
  {
      System.out.println("function with varargs : " + list.length );
  }
  public static void main(String[] args) {	
	   	// calling above function

//		print();		

    varargOverload(true, 1,2,3);

    // In this method call varargs function will be called
      // as no particular match is found here
    varargOverload(true, 1,2,3,4,5,6);

    // again will call varargs overload function
    varargOverload(true);
  }       
}
