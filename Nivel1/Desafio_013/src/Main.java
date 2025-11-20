import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        Ticket ticket = Entry();
        HalfEntry halfEntry = halfFamily(ticket);
    }

    // function for entry
    public static Ticket Entry() {
        Ticket ticket = new Ticket();

        System.out.print("Name of moveis: ");;
        String name = sc.nextLine();
        ticket.setName(name);

        System.out.print("Value of ticket: ");
        double value = sc.nextDouble();
        ticket.setValue(value);
        sc.nextLine();

        System.out.print("Dubbed(D) or Subtitled(S): ");
        String description = sc.next();
        ticket.setDescription(description);

        return ticket;
    }
    //Function for half and family
    public static HalfEntry halfFamily(Ticket ticket) {
        HalfEntry halfEntry = new HalfEntry(ticket.getValue(), ticket.getName(), ticket.getDescription(), ticket.getInformation());

        System.out.print("Half(H) or Family(F): ");
        String information = sc.next().toUpperCase();
        halfEntry.setInformation(information);
        while (!information.equals("H") && !information.equals("F")) {
            System.out.print("Erro! Write again \n. Only accepts H or F: ");
            information = sc.next().toUpperCase();
            halfEntry.setInformation(information);
        }

        //Checking if it is half or family
        if (information.equals("H")) {
            halfEntry.ValueHalfEntry();
            System.out.printf("Half value: $ %.2f%n", halfEntry.getValue());
        }
        else {
            System.out.print("How much person? ");
            Integer person = sc.nextInt();
            sc.nextLine();
            if (person >= 3) {
                Double family = (ticket.getValue() * 0.95) * person;
                System.out.printf("Amount you would pay with discount: $ %.2f%n", family);
            }
            else {
                Double withoutDiscount = person * ticket.getValue();
                System.out.printf("Amount you would pay without discount: $ %.2f%n", withoutDiscount);
            }

        }

        return halfEntry;
    }
}