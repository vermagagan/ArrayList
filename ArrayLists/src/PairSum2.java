import java.util.ArrayList;
public class PairSum2
{
    public static Boolean pairSum2(ArrayList<Integer> list, int target)
    {
        int bp=0;
        for(int i=0; i<list.size()-2; i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int start=bp+1, end=bp;
        while(start != end)
        {
            int n=list.size();
            int check = list.get(start)+list.get(end);
            if(check == target)
                return true;
            else if(check < target)
                start = (start+1)%n;
            else
                end = (n+end-1)%n;
        }
        return false;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
