import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = { "Sexy", "God-Like", "Over-Powered", "Amazing",
                "Ugly", "Sinful", "Disgusting", "Obese", "Inviting", "Decrepit" };

        String[] nouns = {"Apple", "Banana", "Grapefruit", "Pear",
                "Dog", "Pig", "Cat", "Rat", "Shark", "Dolphin"};

        String adjective = getRandomElement(adjectives);

        String noun = getRandomElement(nouns);

        String randomName = adjective + " " +  noun;

        System.out.println("Your server name is: " + randomName);



        }
    public static String getRandomElement(String[] array) {
        Random rando = new Random();

        int index = rando.nextInt(array.length);
        return array[index];
    }

}
