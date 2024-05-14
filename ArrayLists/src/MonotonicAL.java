import java.util.ArrayList;
public class MonotonicAL
{
    public static Boolean monotonic(ArrayList<Integer> list)
    {
        int start = 0, end = 1;
        while (start < list.size() && end < list.size())
        {
            if(list.get(start) < list.get(end))
                return false;
            start++;
            end++;
        }
        return true;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(monotonic(list));
    }
}
