import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
public class ArrayListIteration2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> orders=new ArrayList<>();

        ArrayList<Integer> sortCustomer=new ArrayList<>();
        ArrayList<Integer> finalArr=new ArrayList<>();

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        // arr1.add(3);
        // arr1.add(4);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(3);
        arr2.add(3);
        arr2.add(3);
        // arr2.add(1);
        // arr2.add(3);

        // ArrayList<Integer> arr3=new ArrayList<>();
        // arr3.add(1);
        // arr3.add(2);
        // arr3.add(3);

        orders.add(arr1);
        orders.add(arr2);
        // orders.add(arr3);

        // System.out.println(orders);
        // for (ArrayList<Integer> key : orders) {
        //     for (Integer i : key) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

            // System.out.println(orders.get(0).size());

        // System.out.println(orders.get(0).get(0));
        // System.out.println(orders.get(0).get(1));
        // System.out.println(orders.get(0).get(2));
        // System.out.println(orders.get(0).get(3));
        // System.out.println(orders.get(0).get(4));

        // System.out.println();

        // System.out.println(orders.get(1).get(0));
        // System.out.println(orders.get(1).get(1));
        // System.out.println(orders.get(1).get(2));
        // System.out.println(orders.get(1).get(3));
        // System.out.println(orders.get(1).get(4));

        int len=orders.get(0).size();
        // System.out.println(len);
        int arr[]=new int[len];

        int l=0;
        for(int j=0;j<len;j++)
        {
            arr[j]=orders.get(l).get(j)+orders.get(l+1).get(j);
            // System.out.println(arr[j]);
        }
        

        // System.out.println(Arrays.toString(arr));
        // // System.out.println(sortCustomer);

        //9 6 11 4 7

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(i+1,arr[i]);
        }

        Set<Integer> k=hm.keySet();
        for (Integer key : k) {
            sortCustomer.add(hm.get(key));            
        }

        Collections.sort(sortCustomer);

        for(int i=0;i<sortCustomer.size();i++)
        {
            for (Integer key : k) {
                if(hm.get(key)==sortCustomer.get(i))
                {
                    finalArr.add(key);
                    continue;
                }         
            }
        }

        System.out.println(finalArr);

    }
}
