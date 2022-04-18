import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number in square:");
        float num=scanner.nextFloat();
        float square=num*num;
        System.out.println("The sqaure of num "+ square);

    }
}
class Sq{
    public static void main(String[] args) {
        float num,square;
        num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number in square:"));
        square=num*num;
        JOptionPane.showMessageDialog(null,"The square of num "+square);
    }
}
