import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.print("Enter Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Temperature in Celsius: " + celsius);

        input.close();
    }
}
