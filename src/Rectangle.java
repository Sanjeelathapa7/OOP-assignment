import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double l,b;
        System.out.println("Enter length and breadth in double");
        l= scanner.nextInt();
        b=scanner.nextInt();
        int le=(int)l;
        int bre =(int)b;
        int area=le*bre;
        System.out.println("The area is "+area);
    }
}
class Rect{

}
