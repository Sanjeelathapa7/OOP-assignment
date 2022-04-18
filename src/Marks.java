import javax.swing.*;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        float first,second,third,fourth,total;
        System.out.println("Enter your marks in four subjects:");
        Scanner scanner=new Scanner(System.in);
        first=scanner.nextFloat();
        second=scanner.nextFloat();
        third=scanner.nextFloat();
        fourth=scanner.nextFloat();
        total=(first+second+third+fourth)/4;
        String result;
        result=((total>70)&&(total<100))?"First Class":((total>59)&&(total<70))?"Upper Second Class":((total>49)&&(total<59))?"Second Class":((total>39)&&(total<49))?"Third Class": "Fail";
        System.out.println("Total percentage: "+total+"\nDivision: "+result);

    }
}
class Markss{
    public static void main(String[] args) {
        float first,second,third,fourth,total,percentage;
        first=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter your percentage in first subject:"));
        second=Float.parseFloat(JOptionPane.showInputDialog(null,"Second subject:"));
        third=Float.parseFloat(JOptionPane.showInputDialog(null,"Third subject:"));
        fourth=Float.parseFloat(JOptionPane.showInputDialog(null,"Fourth subject:"));
        total=first+second+third+fourth;
        percentage=total/4;
        JOptionPane.showMessageDialog(null,"Your total marks is "+total);
        JOptionPane.showMessageDialog(null,"Your total percentage is "+percentage);


    }
}
