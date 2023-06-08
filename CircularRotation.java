import java.util.*;
public class CircularRotation {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> queries=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();

        queries.add(0);
        queries.add(1);
        queries.add(2);
        // queries.add(3);

        a.add(1);
        a.add(2);
        a.add(3);
        // a.add(10);
        // a.add(3);
        // a.add(6);

        int k=8;
        k=k%a.size();

        if(k!=0)
        {
            reverse(a,0,a.size()-k-1);
            reverse(a,a.size()-k,a.size()-1);
            reverse(a,0,a.size()-1);
        }

        for(int i=0;i<queries.size();i++)
        {
            result.add(a.get(queries.get(i)));
        }
        System.out.println(result);
        
    }

    public static  void reverse(List<Integer> a,int i,int j)
        {
            int l=i;
            int r=j;
            while(l<r)
            {
                int temp=a.get(l);
                a.set(l,a.get(r));
                a.set(r,temp);

                l++;
                r--;
            }
        }
}
