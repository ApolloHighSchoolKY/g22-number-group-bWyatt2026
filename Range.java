public class Range() extends Numbergroup
{
    private int minimum = 0;
    private int maximum = 0;

    public Range(int n, int b)
    {
        maximum = n;
        minimum = b;
    }

    public int fullRange()
    {
        for(int i = minimum; i<= maximum; i++)
        {
            System.out.print(i);
        }
    }
}
