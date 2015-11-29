package double_dispatch_broken;

public class Rock implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatsRock();
    }

    public boolean beatsRock() { return false; }
    public boolean beatsPaper() { return false; }
    public boolean beatsScissors() { return true; }

    @Override
    public String toString()
    {
        return "Rock";
    }
}
