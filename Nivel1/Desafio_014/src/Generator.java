// java
// src/Generator.java
import java.util.Scanner;

public class Generator {
    private String name;
    private String email;
    private String password;
    private boolean adm;

    protected Product product;

    public Generator(String name, String email, String password, boolean adm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adm = adm;
        this.product = new Product();
    }

    public Generator() {
        this.product = new Product();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    // Helper to read a line with a prompt (avoid repeating code)
    protected String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public void start(Scanner sc) {
        System.out.println("Choose the option");
        System.out.println("1 - Login");
        System.out.println("2 - Out");
        System.out.print("Insert: ");
        int startNumber  = sc.nextInt();
        sc.nextLine();

        login(sc);
        verification(sc);

        // criar instâncias específicas dependendo do tipo de usuário
        Seller seller = null;
        Attendant attendant = null;
        Manager manager = null;

        if (getEmail().equals("seller")) {
            seller = new Seller(getName(), getEmail(), getPassword(), false, 0);
        } else if (getEmail().equals("attendant")) {
            attendant = new Attendant(getName(), getEmail(), getPassword(), false, 0.0);
        } else if (getEmail().equals("adm")) {
            manager = new Manager(getName(), getEmail(), getPassword(), true);
        }

        while (startNumber != 2) {

            System.out.println("1 - Changes Login");
            System.out.println("2 - Out");
            System.out.println("3 - Financial");
            System.out.println("4 - Seles consultation");
            System.out.println("5 - Makes Sale");
            System.out.print("Insert: ");
            startNumber = sc.nextInt();
            sc.nextLine();
            if (startNumber == 1) {
                // reutiliza o método herdado para alterar nome/senha
                if (seller != null) seller.changesLogin(sc);
                else if (attendant != null) attendant.changesLogin(sc);
                else if (manager != null) manager.changesLogin(sc);
                else changesLogin(sc);
            }
            else if (startNumber == 5) {
                if (seller != null) seller.makeSale(sc);
                else System.out.println("Only sellers can make sales.");
            }
            else if (startNumber == 3) {
                if (manager != null) manager.generateFinancialReport();
                else System.out.println("Access denied: only manager can view financial report.");
            }
            else if (startNumber == 4) {
                if (manager != null) manager.consultSales();
                else if (seller != null) seller.consultSales();
                else System.out.println("No sales to consult.");
            }
        }
    }

    public void login(Scanner sc) {
        setName(prompt(sc, "Enter your name: "));

        setEmail(prompt(sc, "Enter your email: "));

        setPassword(prompt(sc, "Enter your password: "));
    }

    public void verification (Scanner sc) {

        while (!email.equals("adm") && !email.equals("seller") && !email.equals("attendant")) {
            System.out.print("Erro! \\nEnter the correct email again: ");
            setEmail(sc.nextLine());
        }

        if (email.equals("adm")) {
            System.out.println("Welcome, adm: " + getName());
        }

        else if (email.equals("seller")) {
            System.out.println("Welcome, seller: " + getName());
        }

        else if (email.equals("attendant")) {
            System.out.println("Welcome, attendant: " + getName());
        }
    }

    public void changesLogin(Scanner sc) {
        System.out.println("What data do you want to change?");
        System.out.println("1 - Name");
        System.out.println("2 - Password");
        System.out.print("Insert: ");
        int changesLoginNumber = sc.nextInt();
        sc.nextLine();
        if (changesLoginNumber == 1) {
            System.out.print("New name: ");
            setName(sc.nextLine());
        }
        else if (changesLoginNumber == 2) {
            System.out.print("New password: ");
            setPassword(sc.nextLine());
        }
    }

    public void Financial() {

    }

    // novo método de logoff
    public void logoff() {
        // podemos limpar os dados ou apenas informar o usuário
        this.name = null;
        this.email = null;
        this.password = null;
        System.out.println("You have been logged off.");
    }

    // alterar senha (método reutilizável)
    public void changePassword(Scanner sc) {
        System.out.print("Enter new password: ");
        setPassword(sc.nextLine());
        System.out.println("Password updated.");
    }

}
