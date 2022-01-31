public class Combination {
    int x;
    int y;
    int z;

    // Constructor
    public Combination( int first, int second, int third ) {
        x = first;
        y = second;
        z = third;
    }

    public boolean equals( Combination other ) {
        if (other == null){
            return false;
        }
        if (x == other.x && y == other.y && z == other.z) {
            return true;
        }
        else {
            return false;
            }
    }
    // Returns a String representation of this Combination.

    public String toString() {
        return (  x + ":" + y + ":" + z ) ;

    }

}
