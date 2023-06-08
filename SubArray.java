public class SubArray {
    public static void main(String[] args) {
        int count=0;
        int max=1;
        int arr[]={4,6,5,3,3,1};
        for(int i=0;i<arr.length-3;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])==1)
            {
                count++;
                for(int j=i+2;j<arr.length-2;j++)
                {
                    if(Math.abs(arr[i]-arr[j])==1)
                    {
                        count++;
                        for(int k=j+2;k<arr.length-1;k++)
                        {
                            if(Math.abs(arr[i]-arr[k])==1)
                            {
                                
                            }
                        }
                    }
                    
                }
            }
            
        }
    }
}
