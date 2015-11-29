package double_dispatch_fix_proposed_in_errata;

public interface GameObject
{
    boolean beats(GameObject o);

    boolean beatsRock();
    boolean beatsPaper();
    boolean beatsScissors();
}
