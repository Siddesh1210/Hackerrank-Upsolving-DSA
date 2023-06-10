import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3,3,4,5,3,2,2,3,1};
        boolean check=false;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                arr.add(nums[i]);
                check=false;
            }
            if(nums[i-1]==nums[i] && check==false)
            {
                arr.add(nums[i]);
                check=true;
            }
        }
        int i=0;
        for(Integer e: arr)
        {
            nums[i]=e;
            i++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(arr.size());
    }
}
