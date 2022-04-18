import javax.swing.*;
import java.util.Scanner;

public class Twostring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string:");
        String first=scanner.nextLine();
        System.out.println("Enter second string:");
        String second=scanner.nextLine();
        String third=first+second;
        System.out.println("Two strings are: "+third);

    }
}
class twostr{
    public static void main(String[] args) {
        String first=JOptionPane.showInputDialog(null,"Enter first string:");
        String second=JOptionPane.showInputDialog(null,"Enter second string:");
        String third=first+second;
        JOptionPane.showMessageDialog(null,"Two strings are: "+third);
    }
}