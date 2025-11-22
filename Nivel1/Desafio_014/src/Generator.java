// src/Generator.java
import java.util.Scanner;

public class Generator {
    private String name;
    private String email;
    private String password;
    private boolean adm;

    public Generator(String name, String email, String password, boolean adm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adm = adm;
    }

    public Generator() {
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

    // Método de login que recebe o Scanner para ler entrada do usuário
    public void login(Scanner sc) {
        System.out.print("Enter your name: ");
        setName(sc.nextLine());

        System.out.print("Enter your email: ");
        setEmail(sc.nextLine());

        System.out.print("Enter your password: ");
        setPassword(sc.nextLine());
    }

    public void verification (Scanner sc) {

        while (!email.equals("adm") && !email.equals("seller") && !email.equals("attendant")) {
            System.out.print("Erro! \nEnter the correct email again: ");
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

}
