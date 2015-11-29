package double_dispatch_fix_proposed_by_me;

import org.junit.Test;

public class GameCoordinatorTest
{
    private static final GameObject ROCK = new Rock();
    private static final GameObject PAPER = new Paper();
    private static final GameObject SCISSORS = new Scissors();

    @Test
    public void test()
    {
        assert( ! ROCK.beats( ROCK ) );
        assert( ! ROCK.beats( PAPER ) );
        assert(   ROCK.beats( SCISSORS ) );

        assert(   PAPER.beats( ROCK ) );
        assert( ! PAPER.beats( PAPER ) );
        assert( ! PAPER.beats( SCISSORS ) );

        assert( ! SCISSORS.beats( ROCK ) );
        assert(   SCISSORS.beats( PAPER ) );
        assert( ! SCISSORS.beats( SCISSORS ) );
    }
}
