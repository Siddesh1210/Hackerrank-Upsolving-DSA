import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
public class ArrayList2D{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> orders=new ArrayList<>();

        ArrayList<Integer> sortCustomer=new ArrayList<>();
        ArrayList<Integer> finalArr=new ArrayList<>();

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        // arr1.add(2);
        // arr1.add(4);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        // arr2.add(6);
        // arr2.add(2);
        // arr2.add(3);
        // arr2.add(3);

        ArrayList<Integer> arr3=new ArrayList<>();
        arr3.add(3);
        // arr3.add(2);
        arr3.add(3);

        orders.add(arr1);
        orders.add(arr2);
        orders.add(arr3);

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

        int arr[]=new int[orders.size()];

        for(int i=0;i<orders.size();i++)
        {
            for(int j=0;j<orders.get(i).size();j++)
            {
                arr[i]+=orders.get(i).get(j);
            }
            sortCustomer.add(arr[i]);
        }
        

        System.out.println(Arrays.toString(arr));
        Collections.sort(sortCustomer);
        System.out.println(sortCustomer);
        // // System.out.println(sortCustomer);

        //11 11 8 5 7

        for(int i=0;i<sortCustomer.size();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(sortCustomer.get(i)==arr[j])
                {
                    finalArr.add(j+1);
                    arr[j]=Integer.MAX_VALUE;
                    j=sortCustomer.size();
                }
            }
        }
        System.out.println(finalArr);

    }
}
