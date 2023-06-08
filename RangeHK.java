public class RangeHK {
    public static void main(String[] args) {
        int i=20;
        int j=23;
        int k=6;
        int count=0;
        String temp="";
        for(int start=i;start<=j;start++)
        {
            String str=Integer.toString(start);
            for(int a=str.length()-1;a>=0;a--)
            {
                temp=temp+str.charAt(a);
            }
            int newTemp=Integer.parseInt(temp);
            if(Math.abs(newTemp-start)%k==0)
            {
                count++;
            }
            temp="";
        }
        System.out.println(count);
    }
}
