import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("You: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else if (input.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa Bro, chill tf out!!!");
            } else {
                System.out.println("Bob: Whatever Dude.");
            }
        }
    }
}


