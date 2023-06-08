public class CharHR
{
    public static void main(String[] args) {
        String str="zaba";
        int max=0;
        char ch='a';
        int h[]={1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(ch==str.charAt(i))
                {
                    System.out.println(ch+" : "+str.charAt(i));
                    max=Math.max(h[j],max);
                    ch++;
                    continue;
                }
                ch++;
            }
            ch='a';
            System.out.println("Max value is "+max+": "+str.charAt(i));
        }
        System.out.println(max*str.length());
        
    }
}