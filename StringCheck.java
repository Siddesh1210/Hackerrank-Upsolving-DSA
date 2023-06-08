public class StringCheck {
    public static void main(String[] args) {
    long n=10;
    String s="abc";
    StringBuilder sb=new StringBuilder();
    long quo=(int)n/s.length();
    int rem=(int)(n%s.length());
    boolean check=true;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!='a')
        {
            check=false;
            break;
        }
    }
    if(check==true)
    {
        // return n;
        System.out.println(n);
    }
    for(int i=1;i<=quo;i++)
    {
        sb.append(s);
    }
    String str=s.substring(0,rem);
    sb.append(str);
    long count=0;
    String temp=sb.toString();
    System.out.println(temp);
    for(int i=0;i<temp.length();i++)
    {
       if(temp.charAt(i)=='a')
       {
           count++;
       } 
    }
    System.out.println(count);
    // return count;
    }
}
