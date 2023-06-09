import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class KFrequencyLC {
    public static void main(String[] args) {
        int k=2;
        int nums[]={1,1,1,3,2,3};
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
        System.out.println(hm);
        Set<Integer> ele=hm.keySet();
        for(Integer key: ele)
        {

            ar.add(hm.get(key));
        }
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
        int index=ar.size()-1;
        int res[]=new int[k];
        int resindex=0;
        while(k>0)
        {
            for(Integer key: ele)
            {
                System.out.println(hm);
                if(hm.get(key)==ar.get(index))
                {
                    res[resindex]=key;
                    resindex++;
                    hm.remove(key);
                    break;
                }
            }
            index--;
            k--;
        }
        System.out.println(Arrays.toString(res));

    }
}
