import javax.swing.*;
import java.util.Scanner;

public class Tria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        float b = scanner.nextInt();
        System.out.println("Enter height:");
        float h = scanner.nextInt();
        float area = (b * h) / 2;
        System.out.println("Area of traingle is " + area);
    }
}

class Triangle{
    public static void main(String[] args) {
        float b,h,area;
        b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter base:"));
        h=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height:"));
        area=b*h/2;
        JOptionPane.showMessageDialog(null,"Area of triangle is "+area);
    }
}





