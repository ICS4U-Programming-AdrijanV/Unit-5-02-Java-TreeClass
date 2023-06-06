// Tree class
/**
 * Represents a tree.
 */
public class Tree {
    /**
     * NumberOfLeaves.
     */
    private int numberOfLeaves;
    /**
     * FeetTall.
     */
    private int feetTall;
    /**
     * Type.
     */
    private String type;
    /**
     * Age.
     */
    private int age;

    /**
     * Constructs a Tree object with the specified initial values.
     *
     * @param initNumberOfLeaves The initial number of leaves.
     * @param initFeetTall The initial height in feet.
     * @param type The type of the tree.
     * @param age The age of the tree.
     */
    public Tree(int initNumberOfLeaves, int initFeetTall,
        String type, int age) {
        this.numberOfLeaves = initNumberOfLeaves;
        this.feetTall = initFeetTall;
        this.type = type;
        this.age = age;
    }

    /**
     * Increases the height and number of leaves of the tree.
     */
    public void grow() {
        this.feetTall += 5;
        this.numberOfLeaves += 10000;
    }

    /**
     * Sets the number of leaves to 0.
     */
    public void loseAllLeaves() {
        this.numberOfLeaves = 0;
    }

    /**
     * Increases the height of the tree by 1.
     */
    public void growSlow() {
        this.feetTall++;
    }

    /**
     * Retrieves the number of leaves of the tree.
     *
     * @return The number of leaves.
     */
    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    /**
     * Retrieves the height of the tree in feet.
     *
     * @return The height in feet.
     */
    public int getFeetTall() {
        return feetTall;
    }

    /**
     * Retrieves the type of the tree.
     *
     * @return The tree type.
     */
    public String getType() {
        return type;
    }

    /**
     * Retrieves the age of the tree.
     *
     * @return The tree age.
     */
    public int getAge() {
        return age;
    }
}
