import javax.swing.*;
import java.util.Scanner;

class Cube{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=scanner.nextInt();
        int volume=l*l*l;
        System.out.println("Volume of cube is "+ volume);

    }
}
class Cu{
    public static void main(String[] args) {
        int l,volume;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        volume=l*l*l;
        JOptionPane.showMessageDialog(null,"Volume of cube is "+volume);
    }
}
