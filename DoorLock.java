public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        this.combination = combination;
        this.numberOfAttempts = 0;
        open = false;
        activated = true;

    }

    // Access methods.

    public boolean isOpen() {
       return open;

        }

    public boolean isActivated() {
        return activated;
    }

    public boolean open( Combination combination ) {
        boolean facts;
        facts = false;

        if (activated == true) {
            if (this.combination.equals(combination)){
                numberOfAttempts = 0;
                facts = true;
                return open = true;
            }
            else {
                numberOfAttempts++;
            }
        }
        if (numberOfAttempts == MAX_NUMBER_OF_ATTEMPTS){
            activated = false;

        }
        return facts;
    }

    public void activate( Combination c ) {

        if (c.equals(this.combination) && numberOfAttempts <= MAX_NUMBER_OF_ATTEMPTS) {
            activated = true;
        }
        else {
            activated = false;

        }

    }

}