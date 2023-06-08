public class StringComparison {
    public static void main(String[] args) {
        String s="y";
        String t="yu";
        int k=2;
        // StringBuilder sb=new StringBuilder();
        int index=-1;
        int min=Math.min(s.length(),t.length());
        for(int i=0;i<min;i++)
        {
            if(s.charAt(i)==t.charAt(i))
            {
                // sb.append(s.charAt(i));
                index=i;
            }
            else{
                break;
            }
        }
        String str=s.substring(index+1,s.length());
        String str2=t.substring(index+1,t.length());
        int movesRequired=str.length()+str2.length();
        // System.out.println(movesRequired);
        if(movesRequired<=k)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(Math.sqrt(100));
        // sb.append(t.substring(index+1,t.length()));
        // System.out.println(sb.toString()+":"+sb.toString().length());

    }
}
