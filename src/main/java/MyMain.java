public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int dice = (int) (6 * Math.random()) + 1;
        return dice;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int sixes = 0;
        for (int i = 0; i < 10000; i++) {
            int dice = (int) (6 * Math.random()) + 1;
            int dice2 = (int) (6 * Math.random()) + 1;
            int dice3 = (int) (6 * Math.random()) + 1;
            int dice4 = (int) (6 * Math.random()) + 1;
            int dice5 = (int) (6 * Math.random()) + 1;
            int dice6 = (int) (6 * Math.random()) + 1;
            if (dice == 6 || dice2 == 6 || dice3 == 6 || dice4 == 6 || dice5 == 6 || dice6 == 6) {
                sixes++;
            }
        }
        float tot = (float) sixes / 100;
        return tot;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int sixes = 0;
        for (int i = 0; i < 10000; i++) {
            int twelvesixes=0;
            for (int j = 0; j < 12; j++) {
                int dice = (int) (6 * Math.random()) + 1;
                if (dice == 6) {
                    twelvesixes = twelvesixes + 1;

                }
            }
            if (twelvesixes>1){
                sixes++;
            }
        }
        float tot = (float) sixes / 100;
        return tot;
    }


    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int sixes = 0;
        for (int i = 0; i < 10000; i++) {
            int twelvesixes=0;
            for (int j = 0; j < 18; j++) {
                int dice = (int) (6 * Math.random()) + 1;
                if (dice == 6) {
                    twelvesixes = twelvesixes + 1;

                }
            }
            if (twelvesixes>2){
                sixes++;
            }
        }
        float tot = (float) sixes / 100;
        return tot;
    }


    public static void main(String[] args) {
        System.out.println(rollDie());
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
