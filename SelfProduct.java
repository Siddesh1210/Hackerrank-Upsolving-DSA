import java.util.Arrays;

public class SelfProduct {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        boolean check=false;
        int prod=1;
        int turn=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0) prod=prod*nums[i];
            if(nums[i]==0)
            {
                // System.out.println("Im inside for I : "+i+" turn is :");
                if(turn==0)
                {
                    check=true;
                    turn++;

                }
                else check=false;
            }
        }

        if(turn==0 && check==false)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=prod/nums[i];
            }
        }
        else if(turn!=0 && check==false)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=0;
            }
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0) nums[i]=prod; 
                else nums[i]=0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
