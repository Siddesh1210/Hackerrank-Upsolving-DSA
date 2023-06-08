import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class KFrequencyLC {
    public static void main(String[] args) {
        int k=2;
        int nums[]={1,1,1,2,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        Set<Integer> ele=hm.keySet();
        for(Integer key: ele)
        {
            // if(hm.get(key)>=k)
            // {
            //     ar.add(key);
            //     // continue;
            // }
            ar.add(hm.get(key));
            // System.out.println(key+":"+hm.get(key));
        }
        Collections.sort(ar);
        int newarr[]=new int[k];
        int index=0;
        for(int i=ar.size()-1;i>=0;i--)
        {
            // newarr[index]=ar.get(i);
            // index++;
            // ar.add();
        }
        System.out.println(Arrays.toString(newarr));


        // for(int i=0;i<k;i++)
        // {
        //     // System.out.println(ar.get(i));
        //     newarr[i]=ar.get(i);
        //     System.out.println(newarr[i]);
        // }
        System.out.println(Arrays.toString(newarr));
        // return newarr;
    }
}
