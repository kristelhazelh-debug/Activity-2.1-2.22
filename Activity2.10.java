import java.util.Scanner;

public class UsingScanner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kristel hazel: ");
        String firstName = input.next();
        System.out.print("Fontanilla: ");
        String middleName = input.next();
        System.out.print("Hacienda: ");
        String lastName = input.next();
        System.out.print("18: ");
        int age = input.nextInt();
        
		System.out.println("FirstName: " + firstName);
        System.out.println("MiddleName: " + middleName);
        System.out.println("LastName: " + lastName);
        System.out.println("Age: " + age);
    }
}
