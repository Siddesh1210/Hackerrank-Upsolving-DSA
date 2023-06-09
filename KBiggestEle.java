import java.util.*;
public class KBiggestEle {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k=4;
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i])==false) hm.put(nums[i],1);
        }
        
        Set<Integer> key=hm.keySet();
        for(Integer ele:key)
        {
            arr.add(ele);
        }
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(arr.get(arr.size()-k));
        // return arr.get(arr.size()-1-k);
    }
}
