class callingMethod {

  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }

  static void primitives(){

	int intHex = 0x0041;
	System.out.println("hex : " + intHex);

	int intBinary = 0b01000001;
	System.out.println("binary : " + intBinary);
}


   static void typecast(){

	byte y=42;
	int x=y;
	System.out.println(x);


//  conversion to float to int [big to small]
	int trunc = (int)1.99;
	System.out.println(trunc);


//  char to int
	int intchar = (int)'A';
	System.out.println(intchar);

}



// go function
static void go(int[] arr)
{
  System.out.println(arr[0]); 

  // calling same object reference will also update the same

  arr[1] = 22;
}
  
  public static void main(String[] args) {	
	   	// calling above function

//		print();		

//		primitives();

//		typecast();		


    int[] arr = {1, 2};

    go(arr);
    System.out.println("Newly added : "+ arr[1]);
  }       
}
