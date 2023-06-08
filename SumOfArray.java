public class SumOfArray {
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};
        int product=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            // int initial=nums[i];
            System.out.println("for : "+nums[i]);
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    product=product*nums[j];
                    System.out.print(product+"*");
                }
            }
            System.out.print("="+product);
            arr[i]=product;
            product=1;
            System.out.println();
        }
    }
}
