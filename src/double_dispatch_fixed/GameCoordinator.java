package double_dispatch_fixed;

import java.util.Arrays;
import java.util.List;

public class GameCoordinator
{
    private static final List<GameObject> OBJECTS = Arrays.asList( new Rock(), new Paper(), new Scissors() );

    public static void main(String[] args)
    {
        for ( GameObject player1 : OBJECTS)
            for (GameObject player2 : OBJECTS)
                System.out.println( player1 + " beats " + player2 + " = " + player1.beats(player2));
    }
}
