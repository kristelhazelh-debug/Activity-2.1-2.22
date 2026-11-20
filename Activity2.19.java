public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String address;
        String motto;

        System.out.print("Enter your full name: ");
        name = input.nextLine();

        System.out.print("Enter your Address: ");
        address = input.nextLine();

        System.out.print("Enter your Motto: ");
        motto = input.nextLine();

        System.out.println("\nStudent Information");
        System.out.println("Full Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Motto: " + motto);

        input.close();
    }
}
