import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeProblem1 {
    public static void main(String[] args) {
        int nums[]={1,2,2,1,1,0};
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0) a.add(nums[i]);
        }

        int arr2[]=new int[nums.length];
        for(int i=0;i<a.size();i++)
        {
            arr2[i]=a.get(i);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
