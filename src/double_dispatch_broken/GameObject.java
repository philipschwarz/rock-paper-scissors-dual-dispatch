package double_dispatch_broken;

public interface GameObject
{
    boolean beats(GameObject o);

    boolean beatsRock();
    boolean beatsPaper();
    boolean beatsScissors();
}
