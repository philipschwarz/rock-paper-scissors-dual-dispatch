package double_dispatch_fix_proposed_in_errata;

public class Rock implements GameObject
{
    public boolean beats(GameObject o) {
        // The receiver is a Rock. Ask the argument about a rock.
        return !o.beatsRock();
    }

    public boolean beatsRock() {
        // Return true since ties answer false
        return true;
    }

    public boolean beatsPaper() {
        //A Rock doesn’t beat a Paper
        return false;
    }

    public boolean beatsScissors() {
        // A Rock beats a Scissors!
        return true;
    }

    @Override
    public String toString()
    {
        return "Rock";
    }
}
