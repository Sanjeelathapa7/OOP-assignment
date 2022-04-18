import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address=scanner.nextLine();
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);


    }
}
class stude{
    public static void main(String[] args) {
        int age;
        String name= JOptionPane.showInputDialog(null,"Enter your name:");
        String address=JOptionPane.showInputDialog(null,"Enter your address:");
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age:"));
        JOptionPane.showMessageDialog(null,"Name: "+name);
        JOptionPane.showMessageDialog(null,"Address: "+address);
        JOptionPane.showMessageDialog(null,"Age: "+age);


    }
}
