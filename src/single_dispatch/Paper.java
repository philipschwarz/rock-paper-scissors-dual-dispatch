package single_dispatch;

public class Paper implements GameObject
{
    public boolean beats(GameObject object)
    {
        boolean result = false;
        if (object.getClass().getSimpleName().equals("Rock"))
        {
            result = true;
        }
        else if (object.getClass().getSimpleName().equals("Paper"))
        {
            result = false;
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
        return "Paper";
    }
}

