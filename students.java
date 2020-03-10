class students{
     int id;
     String name;
     String gender="male";




    // defining constructor
    students(int id, String name)
    {
        this(name);
        this.id =id;

    }

    students(String name){
        this.name = name;

    }



    boolean update(String name){
        // accessing the instance variable
        this.name = name;
        return true;
    }
}

