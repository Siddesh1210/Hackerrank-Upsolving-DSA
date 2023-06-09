public class MAxSubArray {
    public static void main(String[] args) {
        int nums[]={-2,-1,-3,-4,-1,-2,-1,-5,-9};
        int check=Integer.MIN_VALUE;
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            if(currSum<0) currSum=0;
            maxSum=Math.max(currSum,maxSum);
            check=Math.max(check,nums[i]);
        }
        if(check<0) System.out.println(check);
        else System.out.println(maxSum);
    }
}
