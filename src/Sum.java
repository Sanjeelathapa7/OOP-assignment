import javax.swing.*;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number:");
        String num1= scanner.nextLine();
        System.out.println("enter second number:");
        String num2= scanner.nextLine();
        System.out.println("enter third number");
        String num3=scanner.nextLine();
        System.out.println("enter fourth number");
        String num4=scanner.nextLine();
        Double numA1=Double.parseDouble(num1);
        Double numA2=Double.parseDouble(num2);
        Double numA3=Double.parseDouble(num3);
        Double numA4=Double.parseDouble(num4);
        Double num5= numA1+numA2+numA3+numA4;
        System.out.println("the sum of four numbers is " + num5);
        }
    }

    class Add{
        public static void main(String[] args) {
            double num1,num2,num3,num4,num5;
            num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter first number:"));
            num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter second number:"));
            num3=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter third number:"));
            num4=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter fourth number:"));
            num5=num1+num2+num3+num4;
            JOptionPane.showMessageDialog(null,"The sum of four numbers is "+num5);
        }
    }

