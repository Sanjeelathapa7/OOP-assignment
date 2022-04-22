import java.util.Scanner;
import java.lang.*;



class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Maximum number");
        } else {
            System.out.println("Not a maximum number");

        }
    }
}
class Maximum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scanner.nextInt();
        System.out.println("Enter second number:");
        int b=scanner.nextInt();
        System.out.println("Enter third  number:");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println("Maximum Number");

        }
        else if(b>a && b>c){
            System.out.println("Maximum number");
        }
        else{
            System.out.println("not a maximum");
        }
    }
}
class Nega{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scanner.nextInt();

        if(a==0){
            System.out.println("Negative");
        }
        else if(a>0){
            System.out.println("Positive");
        }
       else{
            System.out.println("Zero");
        }
    }
}
    class Month{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the month number(1-12):");
            int month=scanner.nextInt();
//            System.out.println("Enter the year");
//            int year=scanner.nextInt();
//            if((year%40==0)||((year%4==0)))&&((year%100!=0)));

            if(month==1){
                System.out.println("January 31 days");
            }
            else if (month==2){
                System.out.println("February 28 days");
            }
            else if(month==3){
                System.out.println("March 31 days");
            }
            else if(month==4){
                System.out.println("April 30 days");
            }
            else if(month==5) {
                System.out.println("May 31 days");
            }
            else if(month==6){
                System.out.println("June 30 days");
            }
            else if(month==7){
                System.out.println("July 31 days");
            }
            else if(month==8){
                System.out.println("August 31 days");
            }
            else if(month==9){
                System.out.println("September 30 days");
            }
            else if(month==10){
                System.out.println("October 31 days");
            }
            else if(month==11){
                System.out.println("November 30 days");
            }
            else if(month==12){
                System.out.println("December 31 days");
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }

class Trianglee{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first traingle:");
        System.out.println("Enter second trinagle:");
        System.out.println("Enter third triangle:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int total=a+b+c;
        if(total==180){
            System.out.println("It is valid!!");
        }
        else{
            System.out.println("It is not valid!!");
        }
    }

}
class Triaa{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            System.out.println("It is valid triangle");

        }
        else{
            System.out.println("It is not valid triangle");
        }
    }
}
class Iso{
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle");
            else if(a==b||b==c||c==a)
                System.out.println("Isoceles Traingle");
            else
                System.out.println("Scalene Triangle");
        }
        else
            System.out.println("Cant form any traingle");
        }
    }
class Divisible{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println(" number is divisible by 5 and 11");
        } else {
            System.out.println("number is not divisible ");
        }
    }
}
class Even{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a%2==0) {
            System.out.println(" number is even");
        }
        else {
            System.out.println("number is odd");}
    }
}
class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any num");
        int a = scanner.nextInt();
        if (a % 400 == 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
class Profit{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter CP:");
        double cp=scanner.nextDouble();
        System.out.println("Enter SP:");
        double sp=scanner.nextDouble();
        if(cp-sp>0){
            System.out.println("LOSS: "+(cp-sp));
        }
        else if(cp-sp<0){
            System.out.println("PROFIT: "+(sp-cp));
        }
        else
            System.out.println("NEUTRAl");
    }

}


class quadratic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double determinant= b * b - 4.0 * a * c;
        if (determinant> 0.0)
        {
            double r1 = (-b + Math.pow(determinant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(determinant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (determinant == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}

class countnumberofnotes{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = myobj.nextInt();
        int note1000,note500, note100, note50, note20, note10, note5, note2, note1;
        note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(amount >= 1000)
        {
            note1000 = amount/1000;
            amount -= note1000 * 1000;
        }
        if(amount >= 500)
        {
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20)
        {
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1)
        {
            note1 = amount;
        }

        System.out.println("Total number of notes = \n");
        System.out.println("1000 = "+note1000+"\n");
        System.out.println("500 = "+note500+"\n");
        System.out.println("100 = "+note100+"\n");
        System.out.println("50 = "+note50+"\n");
        System.out.println("20 = "+note20+"\n");
        System.out.println("10 = "+note10+"\n");
        System.out.println("5 = "+note5+"\n");
        System.out.println("2 = "+note2+"\n");
        System.out.println("1 = "+note1+"\n");
    }
}

 class Vowels {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the character.");
         String a;
         a = scanner.next();
         String v = "aeiou";
         if (v.contains(a)) {
             System.out.println("The number is a vowel.");
         } else {
             System.out.println("The number is a consonant");
         }
     }



 }


 class Salar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();

        if(salary<=10000){
            System.out.println("HRA=20%\nDA=80%");
        }
        else if(salary<=20000){
            System.out.println("HRA=25%\nDA=90%");
        }
        else {
            System.out.println("HRA=30%\nDA=95%");
        }
    }
}
class Subj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float physics, chemistry, biology, mathematics, computer;

        System.out.print("Enter physics marks: ");
        physics = scanner.nextFloat();

        System.out.println("Enter chemistry marks: ");
        chemistry = scanner.nextFloat();

        System.out.println("Enter biology marks: ");
        biology = scanner.nextFloat();

        System.out.println("Enter mathematics marks: ");
        mathematics = scanner.nextFloat();

        System.out.println("Enter computer marks: ");
        computer = scanner.nextFloat();

        float per = (physics+chemistry+biology+mathematics+computer)/5;

        if (per>=90){
            System.out.println("Grade A");
        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        }
        else if(per>=40){
            System.out.println("Grade E");
        }
        else if(per<40){
            System.out.println("Grade F");
        }
    }
}
class Units {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float bill;

        System.out.print("Enter electricity unit: ");
        float unit = scanner.nextFloat();
        if(unit<=50){
            bill= (float) (unit*0.50);
            System.out.println(bill);
        }
        else if(unit<=150){
            bill = (float) ((float) (50*0.50)+((unit-50)*0.75));
            System.out.println(bill);
        }
        else if(unit<=250){
            bill = (float) ((float) (50*0.50)+(100*0.75)+((unit-150)*1.20));
            System.out.println(bill);
        }
        else if(unit>250){
            bill = (float) ((float) (50*0.50)+(100*0.75)+(100*1.20)+((unit-250)*1.50));
            System.out.println(bill);
        }
    }
}
class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");

        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch<='Z'))
        {
            System.out.println("It is an Uppercase character");
        }
        else if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("It is an lowercase character");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}


class isAlphabet {
    public static void main(String[] args) {
        char ch;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = src.next().charAt(0);

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.print(ch+" is an alphabet");
        }else{
            System.out.print(ch+" is not an alphabet");

        }
    }

}
class Chara{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character:");
        char c=scanner.next().charAt(0);
        if(Character.isAlphabetic(c)){
            System.out.println("The character is an alphabet");
        }
        else if(Character.isDigit(c)){
            System.out.println("The character is not an alphabet");
        }
    }
}

class Upp{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the caharacter:");
        char c=scanner.next().charAt(0);
        if(Character.isUpperCase(c)){
            System.out.println("The characater is uppercase");
        }
        else if(Character.isLowerCase(c)){
            System.out.println("The character is lowercase");
        }
    }
}



