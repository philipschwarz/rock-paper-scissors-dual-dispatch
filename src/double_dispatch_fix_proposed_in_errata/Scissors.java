package double_dispatch_fix_proposed_in_errata;

public class Scissors implements GameObject
{
    public boolean beats(GameObject o) {
        // The receiver is a Scissors. Ask the argument about scissors.
        return !o.beatsScissors();
    }

    public boolean beatsRock() {
        // A Scissors doesn’t beat a Rock!
        return false;
    }

    public boolean beatsPaper() {
        // A Scissors beats a Paper
        return true;
    }

    public boolean beatsScissors() {
        // Return true since ties answer false
        return true;
    }

    @Override
    public String toString()
    {
        return "Scissors";
    }
}
