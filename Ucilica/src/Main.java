import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj = 0;
        boolean ispravanUnos = false;

        while (!ispravanUnos) {
            System.out.print("Unesi broj: ");
            String input = scanner.nextLine();

            try {
                broj = Integer.parseInt(input);
                ispravanUnos = true;
            } catch (NumberFormatException e) {
                System.out.println("Unesen krivi format broja");
            }
        }

        System.out.println("Unijeli ste broj: " + broj);
    }
}
