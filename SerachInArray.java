import java.util.ArrayList;
import java.util.Collections;
public class SerachInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> brr=new ArrayList<>();
        // 203 204 205 206 207 208 203 204 205 206
        arr.add(7);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(5);
        arr.add(3);
        // arr.add(203);
        // arr.add(204);
        // arr.add(205);
        // arr.add(206);

        // 203 204 204 205 206 207 205 208 203 206 205 206 204
        brr.add(7);
        brr.add(2);
        brr.add(5);
        brr.add(4);
        brr.add(6);
        brr.add(3);
        brr.add(5);
        brr.add(3);
        // brr.add(203);
        // brr.add(206);
        // brr.add(205);
        // brr.add(206);
        // brr.add(204);

        Collections.sort(arr);
        Collections.sort(brr);       
        
        for(int i=0;i<brr.size();i++)
        {
            int start=0;
            int end=arr.size();
            boolean found=false;
            int key=brr.get(i);
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(arr.get(mid)==key)
                {
                    arr.remove(mid);
                    found=true;
                    break;
                }
                else if(arr.get(mid)>key) end=mid-1;
                else start=mid+1; 
            }
            if(found==false)
            {
                a.add(key);
            }
        }

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
}
