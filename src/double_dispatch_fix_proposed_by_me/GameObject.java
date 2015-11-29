package double_dispatch_fix_proposed_by_me;

public interface GameObject
{
    boolean beats(GameObject o);

    boolean beatenByRock();
    boolean beatenByPaper();
    boolean beatenByScissors();
}
