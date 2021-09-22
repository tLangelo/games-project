import java.util.Scanner;

public class island {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array of "items"
        String[] items = {"Fishing net", "Flint and steel", "Significant other", "Couch", "Phone",
                                                    "Computer", "Pistol", "Pet", "Bed", "Flashlight"};
        int[] answers = {0,0,0,0,0,0,0,0,0,0};


        System.out.println("What would you bring with you, if you were stranded on an island?(Only one item)");
        // For loop to print out items array
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + ". : " + items[i]);
        }

        // Deciding amount of users, and their items
        int amountOfUsers = 6;
        for (int i = 0; i < amountOfUsers; i++) {
            System.out.println("Enter choice: ");
            int userChoice = scanner.nextInt();
            System.out.println("You've chosen: " + "\"" + items[userChoice-1] + "\"");
            answers [userChoice-1]++;
        }
            // Line to make it more readable
        System.out.println("==============");

        // For loop to find the most chosen answer
        int highestAnswer = 0;
        for (int i = 0; i < answers.length; i++) {
            // Getting most answered item
            if(highestAnswer < answers[i]){
                highestAnswer = answers[i];
            }
        }
        // Printing out amount per item
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " was chosen " + "[" + answers[i] + "]" + " times.");
        }

            // Line to make it more readable
        System.out.println("==============");

        // Printing out the most chosen item
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == highestAnswer){
                System.out.println("\"" + items[i] + "\"" + " was the most chosen item with a whopping amount of " + answers[i] + " times!");
            }
        }


    }
}
