class studentTest{
    public static void main(String[] args){

        // creatig array for each students
        int [] stdId = new  int []{1,2,3};
        
        //creating objects for each user
        students s = new students(stdId[0], "joan");
        s.gender="male";
   
   
        students s1 = new students(stdId[1], "aman");
        s.gender="male";

        students s2 = new students(stdId[2], "arti");
        s.gender="female";


        System.out.println("Student 1 : "+ s.name);
        System.out.println("Student 2 : "+ s1.name);
        System.out.println("Student 3 : "+ s2.name);

   

        s.update("john");
        System.out.println("updates user : "+ s.name);
    }

}