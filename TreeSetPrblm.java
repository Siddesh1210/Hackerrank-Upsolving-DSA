import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetPrblm {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,8,9,10};
        TreeSet<Integer> ts=new TreeSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ts.add(nums[i]);
        }
        for(Integer e:ts)
        {
            arr.add(e);
        }
        
        int max=0;
        int count=1;
        int i=0;
        while(i<arr.size()-2)
        {
            while(true)
            {
                if(arr.get(i+1)-arr.get(i)==1 && i<arr.size()-2) 
                {
                    count++;
                    max=Math.max(count,max);
                    System.out.println("For "+arr.get(i)+" & "+arr.get(i+1)+" = "+max);
                    i++;
                }
                else
                {
                    if(i+1!=arr.size()-1) 
                    {
                        i=i+1;
                    }
                    else
                    {
                        break;
                    }
                    System.out.println("break "+i);
                    count=0;
                    continue;
                }
            }
        }
        System.out.println("Max consecutive is : "+max);
    }
}
