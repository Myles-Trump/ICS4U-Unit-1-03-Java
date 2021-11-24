/*
* The "Microwave" program calculates how long using the
* microwave would take depend on what items and how many
* you input
*
* @author  Myles Trump
* @version 1.0
* @since   2020-11-22
*/

import java.util.Scanner;

/**
* This is the "Microwave" program.
*/
final class Microwave {

    /**
    * How long it takes to microwave a single sub.
    */
    public static final double SUB_TIME = 60.0;

    /**
    * How long it takes to microwave a single pizza.
    */
    public static final double PIZZA_TIME = 45.0;

    /**
    * How long it takes to microwave a single soup.
    */
    public static final double SOUP_TIME = 105.0;

    /**
    * Time multiplier for 1 item.
    */
    public static final double ONE_ITEM = 1.0;

    /**
    * Time multiplier for 2 items.
    */
    public static final double TWO_ITEMS = 1.5;

    /**
    * Time multiplier for 3 items.
    */
    public static final double THREE_ITEMS = 2.0;

    /**
    * This is used to terminate the program if an invalid input is entered.
    */
    public static final double KILL_SWITCH = 1000.0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final double defaultTime;
        final double finalTime;
        final double defaultMultiplier;

        final Scanner foodItem = new Scanner(System.in);

        // ask the user to input what food they have
        System.out.print("Enter your food item (sub, pizza, or soup): ");

        // stores food item of choice
        String chosenFoodItem = foodItem.nextLine();

        // figures out what item was inputed
        if (chosenFoodItem.equals("sub")) {
            defaultTime = SUB_TIME;
        } else if (chosenFoodItem.equals("pizza")) {
            defaultTime = PIZZA_TIME;
        } else if (chosenFoodItem.equals("soup")) {
            defaultTime = SOUP_TIME;
        } else {
            defaultTime = KILL_SWITCH;
            System.out.print("\nYou have entered an invalid input.");
        }

        final Scanner foodAmount = new Scanner(System.in);

        // ask the user to input what food they have
        System.out.print("\nEnter how many food items you have (1-3): ");

        // store food amount of choice
        String chosenFoodAmount = foodAmount.nextLine();

        // figures out what number was inputed
        if (chosenFoodAmount.equals("3")) {
            defaultMultiplier = THREE_ITEMS;
        } else if (chosenFoodAmount.equals("2")) {
            defaultMultiplier = TWO_ITEMS;
        } else if (chosenFoodAmount.equals("1")) {
            defaultMultiplier = ONE_ITEM;
        } else {
            defaultMultiplier = KILL_SWITCH;
            System.out.print("\nYou have entered an invalid input.");
        }

        // calculates total microwave time
        finalTime = defaultTime * defaultMultiplier;

        // an invalid input was made somewhere along the way
        if (finalTime > 999) {
            ;

        // print the total amount of minutes and seconds it will take
        } else {
            System.out.print("\nThe microwave will take "
                + finalTime + " seconds.");
        }

        System.out.println("\nDone.");
    }
}
