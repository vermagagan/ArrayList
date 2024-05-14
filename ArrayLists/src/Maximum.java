import java.util.ArrayList;
public class Maximum
{
    public static void main(String args[])
    {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(37);
        list.add(41);
        list.add(50);
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) >= max)
                max=list.get(i);
        }
        System.out.println(max);
    }
}
