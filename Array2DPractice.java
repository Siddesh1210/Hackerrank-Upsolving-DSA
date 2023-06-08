import java.util.*;
public class Array2DPractice {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> orders=new ArrayList<>();

        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();

        arr1.add(1);
        arr1.add(3);

        arr2.add(2);
        arr2.add(3);

        arr3.add(3);
        arr3.add(3);

        orders.add(arr1);
        orders.add(arr2);
        orders.add(arr3);

        System.out.println(orders.get(0).size());
        int arr[]=new int[orders.size()];

        for(int i=0;i<orders.size();i++)
        {
            for(int j=0;j<orders.get(i).size();j++)
            {
                arr[i]+=orders.get(i).get(j);
            }
            // System.out.println();
        }
        System.out.println(Arrays.toString(arr));



    }
}
