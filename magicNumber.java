class magicNumber{

    public static boolean checkNumber(int n){

    // checking if the number given is 1 then return true
        if(n==1){
            System.out.println("The number given [" + n + "] is a magic number");
            return true;
        }

        else{


                int sum=0;
                int temp=n;

                /* running loop as if given number is greater than 0
                    sum Variable value should be of 2 digits 
                */
                while(sum>9 || temp>0 ){

                // if this condition will not be given everytime it will go in infinte loop as
                    // [temp value will never be reduced and sum value is always greater than 9]      
                    if(temp==0){
                        temp=sum;
                        sum=0;
                    }

                    // System.out.println("temp value:"+temp);
                    sum=sum+(temp%10);
                    // System.out.println("sum value :"+ sum);
                    temp=temp/10;
                }
                
                // checking the number with the given number
                if(sum==1){
                    System.out.println("Number is magic number  : " + n);
                    return true;
                }

                else{
                    System.out.println("Not a magic number :" + n);
                    return false;
                }
        }        
    }

    public static void main(String args[]){

        // System.out.println("Number ans:"+ (-1+1));
        int num = Integer.parseInt(args[0]);

        System.out.println("Value which was given : "+ num);

        // calling the function
        checkNumber(num);
    }
}