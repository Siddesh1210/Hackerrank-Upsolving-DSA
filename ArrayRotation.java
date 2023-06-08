import java.util.ArrayList;

public class ArrayRotation {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> queries=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();


        a.add(1);
        a.add(2);
        a.add(3);

        queries.add(0);
        queries.add(1);
        // queries.add(2);

        int k=2;

        // for(int j=0;j<k;j++)
        // {
        //     int prev=a.get(a.size()-1);
        //     for(int i=0;i<a.size();i++)
        //     {
        //         int temp=a.get(i);
        //         a.set(i,prev);
        //         prev=temp;
        //         // System.out.print(a.get(i)+" ");
        //     }
        //     // System.out.println();
        // }

        // System.out.println(a.size());
        // for(int i=0;i<queries.size();i++)
        // {
        //     int temp=queries.get(i);
        //     arr.add(a.get(temp));
        //     // System.out.print(arr.get(i)+" : ");
        // }
        int index=0;
        for(int i=a.size()-k-1;i<a.size();i++)
        {
            a.set(i,a.get(index));
            index++;
        }
        for(int i=0;i<a.size()-k;i++)
        {
            System.out.println(a.get(i));
        }
    }
}
