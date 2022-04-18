import javax.swing.*;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length:");
        float length=scanner.nextInt();
        float area=length*length;
        float perimeter=4*length;
        System.out.println("The area and perimeter are " +area+"  and "+perimeter+"respectively.");
    }
}
class Peri{
    public static void main(String[] args) {
        float l,area,perimeter;
        l=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length:"));
        area=l*l;
        perimeter=4*l;
        JOptionPane.showMessageDialog(null,"The area is "+area+"respectively.");
        JOptionPane.showMessageDialog(null,"The perimeter is "+perimeter+"respectively.");
    }
}
