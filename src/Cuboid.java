import javax.swing.*;
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=scanner.nextInt();
        System.out.println("Enter breadth:");
        int b=scanner.nextInt();
        System.out.println("Enter height:");
        int h=scanner.nextInt();
        int volume=l*b*h;
        System.out.println("Volume of Cuboid is "+volume);
    }
}
class Cubo{
    public static void main(String[] args) {
        int l,b,h,volume;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter lenghth:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter height:"));
        volume=l*b*h;
        JOptionPane.showMessageDialog(null,"Volume of cuboid is "+volume);

    }
}