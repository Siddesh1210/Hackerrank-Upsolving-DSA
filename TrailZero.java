public class TrailZero {
    public static void main(String[] args) {
        int num=78920890;
        String s=Integer.toString(num);
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='0') break;
            count++;
        }
        System.out.println(s.substring(0,s.length()-count));
    }
}
