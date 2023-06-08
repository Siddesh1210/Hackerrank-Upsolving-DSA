public class GCDString {
    public static void main(String[] args) {
        String str1="LEET";
        String str2="CODE";
        int maxi=str1.length();
        StringBuilder str=new StringBuilder();
        maxi=Math.min(str1.length(),str2.length());
        for(int i=maxi;i>0;i--)
        {
            if(str1.contains(str2.substring(0,i)))
            {
                str.append(str2.substring(0,i));
                break;
            }
        }
        // return temp;
        System.out.println(str.toString());
    }
}
