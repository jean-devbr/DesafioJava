import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Generator genarator = new Generator();
        genarator.login(sc);  // chama o método do objeto para inserir dados
        genarator.verification(sc);

    }
}
