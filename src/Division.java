import javax.swing.*;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a,b,sum,product,division;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        sum=a+b;
        product=a*b;
        division=a/b;
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The division is "+division);

    }
}
class div{
    public static void main(String[] args) {
        int a,b,sum,product,division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number:"));
        sum=a+b;
        product=a*b;
        division=a/b;
        JOptionPane.showMessageDialog(null,"Sum: "+sum);
        JOptionPane.showMessageDialog(null,"Product: "+product);
        JOptionPane.showMessageDialog(null,"Division: "+division);
    }
}
class typecasting{
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int sum=(a+b);
        int product=(a*b);
        double castedSum=(double) (sum);
        double castedProduct=(double) (product);
        System.out.println("The sum: "+castedSum);
        System.out.println("The product: "+castedProduct);
    }
}
