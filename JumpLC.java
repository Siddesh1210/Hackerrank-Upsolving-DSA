public class JumpLC {
    public static void main(String[] args) {
        int nums[]={2,0,5,0,1};
        int goal=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>goal)
            {
                goal=nums[i];
            }
        }   
    }
}
