# Adv_java

## -   Here we will learn Java advance code from scratch

-   What is Java?
-   Compile & Interpret language
-   Print statement
-   Variable 

    -   Decalartion & Assignment
    -   Instance variable - Declared within the body of class

        -   It can only be initialize inside the method of the class not inside the class body.
        -   [ NOTE ] - Any variable can't be reinitialize inside the class can be done only in methods.


-   Character: 
    -   16 bit char
    -   Unsigned integer [positive]

-   Casting mean conversion from 1 data type tp another data type
    
    -   Can be done for int, float, short, char also
    [Char is representation of unsigned integer]

            long y = 42;
            int x = (int) y;

- Statements

    -   Declartion int x =25;
    -   Expression like assignment, method invoke, increment count=25;
    -   control flow

    -   [ 'NOTE' - Expression and control flow statements can't be declared in the class only done inside methods ]


-   Arrays: Container object stored in heap of only 1 type

        int[] arr = new int[5]  //5 is size

            Default value for above will be zero (0)

        int[] arr;

            Default size will be null

        
        int[] arr = new int[]{1,2,3,4};  [can be used after "="]

        int[] arr = {1,2,3,4};   [This can't be used with method invokation]



    -   2-D array

            int[][] array = new int[4][2];

-   METHODS: Logic implementation & has behaviour

    -  Void : 

    
        -   Nothing to return
        -   No need for return statement but can write "return"

                "return_type func_name(parameters)"

                If method return type is Primitive, object reference it should have return type 

-   Type of methods:
    
    -   Instance: Objects of a class
        -   Access to instance objects,variables, methods
    -   Static: By static keywords
        -   No access of instance variable
        -   Main method is static method

                Java is always "Pass by Value" either argument or object reference


-   Method Overloading: Same name with diffent arguments within a class.

-   Varargs: Special type of character
    -   Variable -length arguments
        -   Can take any number of argument
        -   Should be the last or first paramter of method
        -   Only 1 varargs parameter in function call
        - Varargs argument are followed by 3 dots after int

                func(boolean flag, int... items)

                #Invoke
                func(true, int[]{1,2,3)}

                OR
                func(true, 1,2,3)


-   Constructor: Initalize when we run or create object
    -   Initializes object state
    -   Point to remember
        -   Function call through "this" should be the first statement
        -   It should not call itself
        -   No multiple call of constructor can be done with "this"
        -   We can't pass instance variable inside "this"


-   "THIS" : When we want to access members through its own object.
    -   Used to acces the hidden variable of instance class which is hidden by method parameter
    -   Can't be used with static method

            class test{
                String name;

                void update(String name){
                    username = name     //here and above it's hiding instance variable
                }
            }





