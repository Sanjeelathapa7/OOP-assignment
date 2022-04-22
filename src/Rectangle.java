import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Rectangle {
    public static void main(String[] args) {Scanner scanner=new Scanner(System.in);
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

class recta{
    public static void main(String[] args) {
        int l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
        area=l*b;
        JOptionPane.showMessageDialog(null,"The area: "+area);

    }
}