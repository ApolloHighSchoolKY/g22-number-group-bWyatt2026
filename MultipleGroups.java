public class MultipleGroups extends NumberGroup
{
    public boolean contains(int num)
    {
        for(NumberGroup i : groupList)
        {
            if(super.contains(i) = true)
            {
                return true;
            }
        } 
        return false;  
    }
}