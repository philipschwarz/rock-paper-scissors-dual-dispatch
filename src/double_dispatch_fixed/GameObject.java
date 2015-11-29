package double_dispatch_fixed;

public interface GameObject
{
    boolean beats(GameObject o);

    boolean beatenByRock();
    boolean beatenByPaper();
    boolean beatenByScissors();
}
