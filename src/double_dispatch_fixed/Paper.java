package double_dispatch_fixed;

public class Paper implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatenByPaper();
    }

    public boolean beatenByRock() { return false; }
    public boolean beatenByScissors() { return true; }
    public boolean beatenByPaper() { return false; }

    @Override
    public String toString()
    {
        return "Paper";
    }
}

