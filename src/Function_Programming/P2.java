package Function_Programming;

class inherit{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.eat();
    }
}
public class P2 {
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends P2{

}
