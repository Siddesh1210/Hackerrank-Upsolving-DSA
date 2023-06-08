import java.util.ArrayList;
import java.util.Collections;

public class CloestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        // -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
        
        //-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
        
        arr.add(-20);
        arr.add(-3916237);
        arr.add(-357920);
        arr.add(-3620601);
        arr.add(7374819);
        arr.add(-7330761);
        arr.add(30);
        arr.add(6246457);
        arr.add(-6461594);
        arr.add(266854);
        arr.add(-520);
        arr.add(-470);


        int min=Integer.MAX_VALUE;
        
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                min=Math.min(min,Math.abs(arr.get(i)-arr.get(j)));
            }
        }


        for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(Math.abs(arr.get(i)-arr.get(j))==min)
                {
                    a.add(arr.get(i));
                    a.add(arr.get(j));
                }   
            }
        }

        // System.out.println(a.size());
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" : ");
        }

    }
}
