import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Subjects {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Robert");
        System.out.println("Enter your marks in three subjects:");
        System.out.println("First subject:");
        float first=scanner.nextFloat();
        System.out.println("Second subject:");
        float second=scanner.nextFloat();
        System.out.println("Third subject:");
        float third=scanner.nextFloat();
        float total=first+second+third;
        float percentage=total/3;
        System.out.println("Your total marks is "+total+".\nPercenatge is "+percentage+".");
    }
}
class Sub{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hello Robert");
        JOptionPane.showMessageDialog(null,"Enter your marks in three subjects:");
        float first,second,third,total,percentage;
        first=Float.parseFloat(JOptionPane.showInputDialog(null,"First subject:"));
        second=Float.parseFloat(JOptionPane.showInputDialog(null,"Second subject:"));
        third=Float.parseFloat(JOptionPane.showInputDialog(null,"Third subject:"));
        total=first+second+third;
        percentage=total/3;
        JOptionPane.showMessageDialog(null,"Your total marks is "+total+".\nPercentage is "+percentage+".");

    }
}
