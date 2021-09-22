import java.util.Locale;
import java.util.Scanner;

public class RPS_game {

    public static void gamemode(){
        Scanner scanner = new Scanner(System.in);
        String chosenGamemode = "";
        boolean loopBreaker = true;
        do{
            System.out.println("What gamemode would you like to play?\n \"1\" for Singeplayer\n \"2\" for Multiplayer");
            String userInput = scanner.nextLine();
        switch(userInput) {
            case "1":
                chosenGamemode = "Singleplayer";
                System.out.println(chosenGamemode + " was chosen!\n");
                loopBreaker = false;
                singleplayer();
                break;
            case "2":
                chosenGamemode = "Multiplayer";
                System.out.println(chosenGamemode + " was chosen!\n");
                loopBreaker = false;
                multiplayer();
                break;
            default:
                System.out.println("Invalid input!");
            }
        }while(loopBreaker);

        }

    public static void singleplayer(){
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        String npcChoice = "";
        String userChoice = "";
        int randomNumber = (int)(Math.random() * 3);
        boolean loopBreaker = true;

        System.out.println("Welcome to singleplayer Rock, Paper, Scissors!\nBefore we start, what's your name?");
        userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!" + " Please type in your move.\n'Rock'\n'Paper'\nor 'Scissors'");
        // Checking for valid input and adding do/while
        do {
            userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("That's not a valid input!\n   Please try again.");
            }

            // Converting randomNumber to npcChoice
            else {
                if (randomNumber == 0) {
                    npcChoice = "Rock";
                } else if (randomNumber == 1) {
                    npcChoice = "Paper";
                } else {
                    npcChoice = "Scissors";
                }
                // Printing out choices and making userChoice prettier💁 and easier to use‍️.
                System.out.println("You chose " + userChoice.substring(0,1).toUpperCase() + userChoice.substring(1).toLowerCase());
                System.out.println("The computer chose " + npcChoice);
                loopBreaker = false;
            }
        } while(loopBreaker);

        // Checking if player won/lost
        if(userChoice.equalsIgnoreCase(npcChoice)){
            System.out.println("It's a tie!");
        }
        else if(userChoice.equals("Rock") && npcChoice.equals("Scissors") || userChoice.equals("Paper") && npcChoice.equals("Rock")
        || userChoice.equals("Scissors") && npcChoice.equals("Paper")){
            System.out.println("You won! Welldone " + userName);
        }
        else{
            System.out.println("You lost!\nBetter luck next time " + userName);
        }

    }

    public static void multiplayer(){
        Scanner scanner = new Scanner(System.in);
        // Adding variables
        String userName1 = "";
        String userName2 = "";
        String userChoice1 = "";
        String userChoice2 = "";

        // Getting names
        System.out.println("Welcome to multiplayer Rock, Paper, Scissors!\nPlease enter Player 1's name:");
        userName1 = scanner.nextLine();
        System.out.println("and now Player 2's name:");
        userName2 = scanner.nextLine();
        boolean loopBreaker = true;

        // Getting moves and checking if they're viable inputs
        while(loopBreaker) {
            // 1st player
            System.out.println(userName1 + " please type in your move\n'Rock'\n'Paper'\nor 'Scissors'");
            userChoice1 = scanner.nextLine();
            userChoice1 = userChoice1.substring(0, 1).toUpperCase() + userChoice1.substring(1).toLowerCase();

            if(!userChoice1.equals("Rock") && !userChoice1.equals("Paper") && !userChoice1.equals("Scissors")){
                System.out.println("Not a valid input. Please try again:");
            }
            // 2nd player
            else{
                System.out.println(userName2 + " please type in your move\n'Rock'\n'Paper'\nor 'Scissors'");
                userChoice2 = scanner.nextLine();
                userChoice2 = userChoice2.substring(0, 1).toUpperCase() + userChoice2.substring(1).toLowerCase();

                if(!userChoice2.equals("Rock") && !userChoice2.equals("Paper") && !userChoice2.equals("Scissors")){
                    System.out.println("Not a valid input. Please try again:");
                }
                else{
                    // Deciding who won
                    // 1st players win conditions
                    if (userChoice1.equals("Rock") && userChoice2.equals("Scissors") || userChoice1.equals("Paper") && userChoice2.equals("Rock")
                            || userChoice1.equals("Scissors") && userChoice2.equals("Paper")) {
                        System.out.println(userName1 + " chose " + userChoice1 + " and won!");
                        loopBreaker = false;
                    }
                    // 2nd players win conditions
                    else if (userChoice2.equals("Rock") && userChoice1.equals("Scissors") || userChoice2.equals("Paper") && userChoice1.equals("Rock")
                            || userChoice2.equals("Scissors") && userChoice1.equals("Paper")) {
                        System.out.println(userName2 + " chose " + userChoice2 + " and won!");
                        loopBreaker = false;
                    }
                    // Tie
                    else {
                        System.out.println("You both chose " + userChoice1 + " and its a tie!");
                        loopBreaker = false;
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gamemode();

    }
}
