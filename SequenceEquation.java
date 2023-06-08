import java.util.*;
public class SequenceEquation {
    public static void main(String[] args) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();

        // p.add(5);
        p.add(2);
        p.add(3);
        p.add(1);
        // p.add(4);

        int index=-1;
        int x=0;
        for(int i=0;i<p.size();i++)
        {
            x++;
            for(int k=0;k<p.size();k++)
            {
                if(x==p.get(k))
                {
                    index=k+1;
                    k=p.size();
                }
            }

            for(int j=0;j<p.size();j++)
            {
                if(index==p.get(j))
                {
                    index=j+1;
                    result.add(index);
                    j=p.size();
                }
            }
        }
        System.out.println(result);
    }
}
