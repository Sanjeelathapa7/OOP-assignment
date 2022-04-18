import javax.swing.*;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        String result=(a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        System.out.println(result);
    }
}
class Var{
    public static void main(String[] args) {
        int a,b;
        String result;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number:"));
        result=(a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        JOptionPane.showMessageDialog(null,"Result: "+result);



    }
}
