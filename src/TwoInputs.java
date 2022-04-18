import javax.swing.*;
import java.util.Scanner;

public class TwoInputs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        int num1= scanner.nextInt();
        System.out.println("b:");
        int num2= scanner.nextInt();
        int num3= num1+num2;
        int num4=num1*num2;
        System.out.println("sum of two integers is "+ num3);
        System.out.println("product of two integers is "+ num4);

    }
}
class Inp{
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"a:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"b:"));
        num3=num1+num2;
        num4=num1*num2;
        JOptionPane.showMessageDialog(null,"Sum of two integers is "+num3);
        JOptionPane.showMessageDialog(null,"Product of two integers is "+num4);
    }
}
