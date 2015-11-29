package single_dispatch;

public class Rock implements GameObject
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
            result = false;
        }
        else if (object.getClass().getSimpleName().equals("Scissors"))
        {
            result = true;
        }
        return result;
    }

    @Override
    public String toString()
    {
        return "Rock";
    }
}
