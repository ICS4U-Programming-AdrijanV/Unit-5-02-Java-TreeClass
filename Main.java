/**
 * The main file.
 *
 * @author Adrijan Vranjkovic
 * @version 1.0
 * @since 2023-06-05
 */
final public class Main {
    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Print messages.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        // Initialize the tree.
        final Tree backyardTree = new Tree(50000, 50, "Oak", 10);
        // Display the initial values.
        System.out.println("The initial number of leaves and"
            + " feet tall, respectively.");
        System.out.println(backyardTree.numberOfLeaves);
        System.out.println(backyardTree.feetTall);

        // Call grow func.
        backyardTree.grow();

        // Display the new values.
        System.out.println("The tree grew!");
        System.out.println(backyardTree.numberOfLeaves);
        System.out.println(backyardTree.feetTall);

        // Call lose leaves and slowGrow
        backyardTree.loseAllLeaves();
        backyardTree.growSlow();

        // Display the final values.
        System.out.println("The leaves fell off.");
        System.out.println(backyardTree.numberOfLeaves);

        System.out.println("The tree slowly grew.");
        System.out.println(backyardTree.feetTall);
    }
}
