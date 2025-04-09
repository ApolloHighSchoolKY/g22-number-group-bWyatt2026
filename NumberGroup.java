public class NumberGroup()
{
    private NumberGrop group1;

    public boolean contains(int number)
    {
        for(int i : group1)
        {
            if(i==number)
            {
                return true;
            }
            return false;
        }
    }
}