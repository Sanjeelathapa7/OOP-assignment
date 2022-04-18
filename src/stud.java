import javax.swing.*;
import java.util.Scanner;

public class stud {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your roll number:");
        int roll=scanner.nextInt();
        System.out.println("Enter your field of interest");
        String fields=scanner.nextLine();
        System.out.println("My name is " + name);
        System.out.println("My roll number is "+ roll);
        System.out.println("My field interest is " +fields);

    }
}
class std{
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"Enter your name:");
        int rollno=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your roll number:"));
        String field=JOptionPane.showInputDialog(null,"Enter your field of interest:");
        JOptionPane.showMessageDialog(null,"Name: "+name);
        JOptionPane.showMessageDialog(null,"Rollno: "+rollno);
        JOptionPane.showMessageDialog(null,"Field: "+field);

    }
}


