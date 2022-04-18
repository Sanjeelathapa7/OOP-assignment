import javax.swing.*;
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=scanner.nextInt();
        System.out.println("Enter time:");
        int t=scanner.nextInt();
        System.out.println("Enter rate:");
        int r=scanner.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("The simple interest is "+ SI);
    }
}
class Simple{
    public static void main(String[] args) {
        int p,t,r,si;
        p=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the principle:"));
        t=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the time:"));
        r=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the rate:"));
        si=(p*t*r)/100;
        JOptionPane.showMessageDialog(null,"The simple interest is "+si);

    }
}