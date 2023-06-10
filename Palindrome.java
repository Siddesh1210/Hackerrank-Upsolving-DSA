public class Palindrome {
    public static void main(String[] args) {
        String s="abbc";
        int start=0;
        int lastindex=s.length()-1;
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            System.out.println("Went");
            boolean check=plaindrome(s.substring(start,lastindex-i+1),start,lastindex-i);
            if(check==true) max=Math.max(max,lastindex);
        }
        System.out.println("The maximum palindrome string is : "+(max+1));
    }

    public static boolean plaindrome(String s,int l,int r)
    {
        while(l<=r)
            {
                if(s.charAt(l)==(s.charAt(r)))
                {
                    l++;
                    r--;
                }
                else
                {
                    return false;
                }
            }
            return true;
    }
}
