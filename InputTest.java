import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        var name = in.nextLine();
        System.out.println("How old are you?");
        var age = in.nextInt();

        System.out.println("Name: " + name + ", Age:" + age);

        in.close();

    }
}
