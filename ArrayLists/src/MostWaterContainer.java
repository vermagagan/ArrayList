import java.util.ArrayList;
public class MostWaterContainer
{
    public static void BruteForce(ArrayList <Integer> list)
    {
        int maxCon=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                int ht=Math.min(list.get(i), list.get(j));
                int currwater=ht*(j-i);
                maxCon=Math.max(maxCon,currwater);
            }
        }
        System.out.println("Maximum Water container by Brute Force is: "+maxCon);
    }
    public static void OptimisedApproach(ArrayList<Integer> list)
    {
        int currMax=Integer.MIN_VALUE;
        int start=0,end=list.size()-1;
        while(start<end)
        {
            int ht=Math.min(list.get(start), list.get(end));
            currMax=Math.max(currMax,((end-start)*ht));
            if(list.get(start)<list.get(end))
                start++;
            else
                end--;
        }
        System.out.println("Maximum Water container by Optimised Approach is: "+currMax);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        BruteForce(list);
        OptimisedApproach(list);
    }
}
