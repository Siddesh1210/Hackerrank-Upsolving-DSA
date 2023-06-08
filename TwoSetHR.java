import java.util.ArrayList;
public class TwoSetHR {
    public static void main(String[] args) {
        // int a[]={2,6};
        // int b[]={24,36};
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();


        a.add(2);
        a.add(4);

        b.add(16);
        b.add(32);
        b.add(96);

        int bigFirstArray=Integer.MIN_VALUE;
        int smallSecondArray=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++)
        {
            bigFirstArray=Math.max(a.get(i),bigFirstArray);
        }

        for(int i=0;i<b.size();i++)
        {
            smallSecondArray=Math.min(b.get(i),smallSecondArray);
        }

        for(int i=bigFirstArray;i<=smallSecondArray;i++)
        {
            boolean check=true;
            for(int j=0;j<a.size();j++)
            {
                if(i%a.get(j)!=0)
                {
                    check=false;
                    j=b.size();
                }
            }
            if(check==true)
            {
                result.add(i);
            } 
        }
        // System.out.println(result);


        // System.out.println(bigFirstArray+" : "+smallSecondArray);

        int count=0;

        for(int i=0;i<result.size();i++)
        {
            boolean check=true;
            for(int j=0;j<b.size();j++)
            {
                if(b.get(j)%result.get(i)!=0)
                {
                    check=false;
                    j=b.size();
                }
            }
            if(check==true)
            {
                System.out.println(result.get(i)+" ");
                count++;
            } 
        }

        System.out.println(count);
    }
}
