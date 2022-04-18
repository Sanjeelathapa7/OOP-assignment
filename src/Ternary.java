import javax.swing.*;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        System.out.println("Enter third number:");
        c=scanner.nextInt();
        String result=(a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second numbers are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"ALl the numbers are different!!";
        System.out.println(result);
    }
}
class Ter{
    public static void main(String[] args) {
        int a,b,c;
        String result;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number:"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number:"));
        result=(a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second numbers are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"All the numbers are different!!";
        JOptionPane.showMessageDialog(null,"Result: "+result);
    }
}
