package double_dispatch_fix_proposed_in_errata;

public class Paper implements GameObject
{
    public boolean beats(GameObject o) {
        // The receiver is a Paper. Ask the argument about paper.
        return !o.beatsPaper();
    }

    public boolean beatsRock() {
        // A Paper beats a Rock
        return true;
    }

    public boolean beatsPaper() {
        // Return true since ties answer false
        return true;
    }

    public boolean beatsScissors() {
        // A Paper doesn’t beat a Scissors!
        return false;
    }

    @Override
    public String toString()
    {
        return "Paper";
    }
}

