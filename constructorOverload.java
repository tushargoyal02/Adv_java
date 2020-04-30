class User{
    int id, salary;
    String name;


    User(int userid, String username){
        id = userid;
        name = username;

    }

    User(int userid, String username, int usersalary){

        this(userid, username);
        salary = usersalary;
    }

    public static void  main(String[] args){

        User u = new User(100, "tushar", 2000);
        System.out.println("user is like : " + u.name);
    }
}
