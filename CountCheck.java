import java.util.ArrayList;

public class CountCheck {
    public static void main(String[] args) {
        int p=20;
        int d=3;
        int m=6;
        int s=80;
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
    
        for(int i=0;i<s/2;i++)
        {
            if(p>m)
            {
                arr.add(p);
                p=p-d;
            }
            else
            {
                arr.add(m);
            }
        }
        System.out.println(arr);
        for(int i=0;i<arr.size();i++)
        {
            if(s-arr.get(i)>=0)
            {
                count++;
                s=s-arr.get(i);
            }
        }
    }
}
