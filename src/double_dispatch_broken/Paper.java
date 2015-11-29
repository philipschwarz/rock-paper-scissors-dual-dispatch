package double_dispatch_broken;

public class Paper implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatsPaper();
    }

    public boolean beatsRock() { return true; }
    public boolean beatsPaper() { return false; }
    public boolean beatsScissors() { return false; }

    @Override
    public String toString()
    {
        return "Paper";
    }
}

