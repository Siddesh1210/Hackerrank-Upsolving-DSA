import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int nums[]={1};
        int k=6;
        k=k>nums.length?k%nums.length:k;
        if(nums.length==k || nums.length==1)
        {
            System.out.println("Inside Loop once");
            System.out.print(Arrays.toString(nums));
        }
        else
        {
            reverse(nums,0,nums.length-k-1);
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-1);
            System.out.print(Arrays.toString(nums));
        }
    }

    public static void reverse(int nums[],int i,int j)
    {
        int l=i;
        int r=j;
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l=l+1;
            r=r-1;
        }
    }
}
