public class palindrome{

    public static void main(String args[]){
        
        // System.out.println("hello world");
        // System.out.println(args[0]+7);

        int num = Integer.parseInt(args[0]);
        System.out.println("Integer value:" + num);

    // Check if the value is less than or equal to 0
    if(num<=0){
        System.out.println("Please provide the number greater than 0");
            
    }

    else{

        for(int i=1;i<=num;i++){

            // System.out.println(i);
            
                int temp=i;
                int sum=0;
    
                // for(i=1;i<=args.length;++i){

                while(temp>0)
                {
                    // Getting the reminder values
                    int reminder=temp%10;
    
                    // System.out.println("temp value:" + temp);
                    // getting the sum of value how it holds
                    
                    sum = sum*10 +reminder; 
                    temp=temp/10;
    
                    // System.out.println("Reminder value :" +reminder);
                    // System.out.println("total Sum :" + sum);
                    
                }
    
                if(sum==num){
                    System.out.println("Number is pallindrome : "+ i);
                }
                else{
                    System.out.println("Number is not pallindrome : "+ i);
                }
    
            
            
            }

    }

    
    }
}