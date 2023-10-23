import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class myName {
    public static void main(String[] args) {
        String name;
        int  year , DOB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello My Name is BOT What is Yours!");
        name = sc.nextLine();
        System.out.println("Hi " + name + " Nice To Meet You! May I Ask What Year is it?");
        year = sc.nextInt();
        System.out.println("What Year Were You Born?");
        DOB = sc.nextInt();
        int age = year - DOB;
        System.out.println("From This information I now know that the year is " + year + " and you," + name + " , was born within the year of " +  DOB + " From This Ican say that you are " + age + " years old ");

        }
    }