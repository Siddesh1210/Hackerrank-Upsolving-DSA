import java.util.ArrayList;
import java.util.Collections;
public class CuttheStickHR {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(3);
        // arr.add(3);
        // arr.add(2);
        // arr.add(1);


        while(arr.size()>0)
        {
            // System.out.println(arr.size()+" is ArraySize");
            Collections.sort(arr);
            // System.out.println(arr);
            int min=arr.get(0);
            // System.out.println(min);
            int count=0;
            for(int j=0;j<arr.size();j++)
            {
                
                if(arr.get(j)-min<=0)
                {
                    arr.remove(j);
                    j--;
                }
                else
                {
                    arr.set(j,arr.get(j)-min);
                }
                count++;
            }
            result.add(count);
            // System.out.println("Cutting of element is : "+count);
            // System.out.println("Array Size : "+arr.size());
        }
        System.out.println(result);


    }
}
