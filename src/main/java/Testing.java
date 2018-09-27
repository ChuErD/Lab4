import java.util.Scanner;

/**
 * this class is for testing purpose.
 */
public class Testing {
    /**
     * The maximum number of hit points we will allow a Pokemon to start with.
     */
    static final int MAX_HIT_POINTS = 50;

    /**
     * The maximum number of rounds we will let the Pokemon battle.
     */
    static final int MAX_NUM_ROUNDS = 10;

    /**
     * The first Pokemon we will be fighting.
     */
    static Pokemon firstPokemon;

    /**
     * The second Pokemon we will be fighting.
     */
    static Pokemon secondPokemon;

    /**
     * Input scanner. Use this to take in user's input for buildPokemon(). <br>
     * Useful functions: next(), nextInt() .
     */
    static Scanner myScan = new Scanner(System.in);

    /**
     * @return returns a built up pokemon
     */
    private static Pokemon buildPokemon() {
        Pokemon tempPokemon = new Pokemon();
        System.out.println("Please name your pokemon: ");
        //myScan = new Scanner(System.in);
        tempPokemon.name = myScan.next();
        System.out.println("How many hit points will it have: ");
        tempPokemon.hitPoints = myScan.nextInt();
        while (tempPokemon.hitPoints < 0 || tempPokemon.hitPoints > MAX_HIT_POINTS) {
            System.out.println("Sorry, hit points must be between 1 and 50: ");
            tempPokemon.hitPoints = myScan.nextInt();
        }
        System.out.println("Split fifty points between attack and defense level");
        System.out.println("Enter your attack level(1 - 49): ");
        tempPokemon.attackLevel = myScan.nextInt();
        while (tempPokemon.attackLevel < 1 || tempPokemon.attackLevel > MAX_HIT_POINTS - 1) {
            System.out.println("Sorry, The attack level must be between 1 and 49: ");
            tempPokemon.attackLevel = myScan.nextInt();
        }
        int maxDefense = MAX_HIT_POINTS - tempPokemon.attackLevel;
        System.out.println("Enter your defense level (1-" + maxDefense + "): ");
        tempPokemon.defenseLevel = myScan.nextInt();
        while (tempPokemon.defenseLevel < 1 || tempPokemon.defenseLevel > maxDefense) {
            System.out.println("Sorry. The defense level must be between 1 and " + maxDefense);
            tempPokemon.defenseLevel = myScan.nextInt();
        }
        return tempPokemon;
    }

    /**
     * @param unused this is not used.
     */
    public static void main(final String[] unused) {
        Pokemon testing = buildPokemon();
    }
}
