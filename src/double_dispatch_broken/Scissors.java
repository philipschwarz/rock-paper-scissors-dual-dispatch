package double_dispatch_broken;

public class Scissors implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatsScissors();
    }

    public boolean beatsRock() { return false; }
    public boolean beatsPaper() { return true; }
    public boolean beatsScissors() { return false; }

    @Override
    public String toString()
    {
        return "Scissors";
    }
}
