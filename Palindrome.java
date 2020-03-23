public class Palindrome{

    public static int changeNum(int n){

        int sum=0;
        int temp=n;
        int reminder;

        System.out.println("-  N value - " + n);
        while(n>0)
            {
                
               reminder=n%10;
            //    System.out.println("reminder value :" + reminder);
                sum=sum * 10 + reminder; 
                // System.out.println("Sum value:" + sum);
                n=n/10;

                // System.out.println("looop n value:" + n);

            }
        // System.out.println("Sum Value is :" + sum );
        return sum;
    }


    /* This function calls the above function &
     check whether input number and reverse number is same or not */

    public static boolean booleanCheck(int num){

        if(num==changeNum(num)){
            return true;
        }

        return false;
    }


    // This function call the function created above and will return the number whether a palindrome or not
    public static void callAll(int num){

        if(num<=0){
            System.out.println("Kindly provide a number greater than 0 " + num);
        }

        else{
            for(int i=1;i<=num; i++){

                // System.out.println(i);

                if(booleanCheck(i)==true){
                    System.out.println("  -    Number is palindrome  - !!!!!!!!!! " + i);
                    }

                else{
                    System.out.println("Number is not pallindrome " + i);
                }
            }
        }
    }




    public static void main(String args[]){

        System.out.println("Inside the main & the val : "+ args[0]);


        int num = Integer.parseInt(args[0]);
        System.out.println("Integer value:" + num);

        // System.out.println("Calling the function : " + changeNum(num));
        /*
        calling function [callAll] -> This will first check the number greater than 0
        
        Then calls the function
        */

        // System.out.println("Calling the Main [Call All] function :" + callAll(num) );
        callAll(num);
    }
}