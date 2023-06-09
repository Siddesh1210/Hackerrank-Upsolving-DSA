public class ReverseIntegerLC {
    public static void main(String[] args) {
        int x=1534236469;
        int lastIndex=x>0?0:1;
        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=lastIndex;i--)
        {
            sb.append(s.charAt(i));
        }
        if(lastIndex==1)
        {
            sb.insert(0,'-');
        }
        // System.out.println(sb.toString());
        if(Long.parseLong(sb.toString())>=Integer.MIN_VALUE && Long.parseLong(sb.toString())<=Integer.MAX_VALUE)
        {
            int res=Integer.parseInt(sb.toString());
            System.out.println(res);
        }
        else{
            System.out.println("0");
        }
        // int temp=Integer.parseInt(sb.toString());
        // System.out.println(temp);
    }
}
