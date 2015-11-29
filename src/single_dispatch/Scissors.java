package single_dispatch;

public class Scissors implements GameObject
{
    public boolean beats(GameObject object)
    {
        boolean result = false;
        if (object.getClass().getSimpleName().equals("Rock"))
        {
            result = false;
        }
        else if (object.getClass().getSimpleName().equals("Paper"))
        {
            result = true;
        }
        else if (object.getClass().getSimpleName().equals("Scissors"))
        {
            result = false;
        }
        return result;
    }

    @Override
    public String toString()
    {
        return "Scissors";
    }
}
