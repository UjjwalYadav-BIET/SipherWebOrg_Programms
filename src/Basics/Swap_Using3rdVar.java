package Basics;

public class Swap_Using3rdVar {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the num1");
        int n1 = 5;
        System.out.println("n1:"+n1);
//        System.out.println("Enter the num2");
        int n2 = 3;
        System.out.println("n2:"+n2);
        int n3;
        n3=n1;
        n1=n2;
        n2 =n3;
        System.out.println(n1);
        System.out.println(n2);

    }*/

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "," + b);
    }
}
