import java.util.ArrayList;
public class PairSum
{
    public static Boolean pairSum(ArrayList<Integer> list, int target)
    {
        int start=0,end=list.size()-1;
        int check=0;
        while(start != end)
        {
            check = list.get(start)+list.get(end);
            if(check == target)
                return true;
            else if(check < target)
                start++;
            else
                end--;
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        
        System.out.println(pairSum(list, target));
    }
}
