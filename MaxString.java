public class MaxString {
    public static void main(String[] args) {
        String s="abciiidef";
        int k=5;
        int maxCount=0;
        int maxLength=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            maxCount=0;
            String str=s.substring(i,i+k);
            System.out.println(str);
            for(int j=0;j<k;j++)
            {
                if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u')
                {
                    maxCount++;
                    maxLength=Math.max(maxCount,maxLength);
                }
            }
        }
        System.out.println(maxLength);
    }
}
