import java.util.ArrayList;
public class MultiDimensionalAL
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        mainlist.add(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(8);
        mainlist.add(list2);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(5);
        list3.add(6);
        list3.add(9);
        mainlist.add(list3);
        for(int i=0; i<mainlist.size(); i++)
        {
            ArrayList<Integer> currList=mainlist.get(i);
            System.out.println(currList);
        }
    }
}
