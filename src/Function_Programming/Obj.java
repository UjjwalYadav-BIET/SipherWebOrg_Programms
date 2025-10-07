package Function_Programming;

public class Obj {
    public static void main(String[] args) {
        Ram obj = new Ram("ram",7); // Object Creation.
        System.out.println(obj.name);
//      System.out.println(obj.pwd); // It will show the error bcz the variable 'pwd' is private.
    }

}

class Ram {
//    public String userName;
//    private String pwd;

    public String name;
    public int roll_no;


    //Constructor :- Special type of the function, same name as the class name, automatically when we create the obj of the class.
    Ram(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }


}
