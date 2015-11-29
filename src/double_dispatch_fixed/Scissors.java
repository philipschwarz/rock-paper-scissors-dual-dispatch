package double_dispatch_fixed;

public class Scissors implements GameObject
{
    public boolean beats(GameObject o)
    {
        return o.beatenByScissors();
    }

    public boolean beatenByRock() { return true; }
    public boolean beatenByScissors() { return false; }
    public boolean beatenByPaper() { return false; }

    @Override
    public String toString()
    {
        return "Scissors";
    }
}
