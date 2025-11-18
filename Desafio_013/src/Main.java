import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        Ticket ticket = Entry();
        HalfEntry halfEntry = halfFamily();
    }

    public static Ticket Entry() {
        Ticket ticket = new Ticket();

        System.out.print("Name of moveis: ");;
        String name = sc.nextLine();
        ticket.setName(name);

        System.out.print("Value of ticket: ");
        double value = sc.nextDouble();
        ticket.setValue(value);

        System.out.print("Dubbed(D) or Subtitled(S): ");
        String description = sc.next();
        ticket.setDescription(description);

        return ticket;
    }

    public static HalfEntry halfFamily() {
        HalfEntry halfEntry = new HalfEntry();

        System.out.print("Half(H) or Family(F): ");
        String information = sc.next().toUpperCase();
        halfEntry.setInformation(information);

        if (information.equals("H"))
            halfEntry.getValue();
        
        return halfEntry;
    }
}
