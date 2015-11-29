package double_dispatch_fix_proposed_by_me;

public class Rock implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatenByRock();
    }

    public boolean beatenByRock() { return false; }
    public boolean beatenByScissors() { return false; }
    public boolean beatenByPaper() { return true; }

    @Override
    public String toString()
    {
        return "Rock";
    }
}
