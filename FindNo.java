import java.util.*;
public class FindNo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> brr=new ArrayList<>();

        // 203 204 205 206 207 208 203 204 205 206
        arr.add(203);
        arr.add(204);
        arr.add(205);
        arr.add(206);
        arr.add(207);
        arr.add(208);
        arr.add(203);
        arr.add(204);
        arr.add(205);
        arr.add(206);


        //203 204 204 205 206 207 205 208 203 206 205 206 204
        brr.add(203);
        brr.add(204);
        brr.add(204);
        brr.add(205);
        brr.add(206);
        brr.add(207);
        brr.add(205);
        brr.add(208);
        brr.add(203);
        brr.add(206);
        brr.add(205);
        brr.add(206);
        brr.add(204);


        ArrayList<Integer> a=new ArrayList<>();
        Collections.sort(arr);
        // System.out.println(arr);
        Collections.sort(brr);
        // System.out.println(brr);
        
        for(int i=0;i<brr.size();i++)
        {
            System.out.println(brr.get(i)+" ");
            for(int j=0;j<arr.size();j++)
            {
                System.out.print(arr.get(j)+" - ");
                if(arr.get(j)==brr.get(i))
                {
                    System.out.println("Come inside");
                    arr.set(j,-1);
                    j=arr.size();
                }
                else if(arr.get(j)>brr.get(i) || j==arr.size()-1)
                {
                    // count++;
                    // System.out.print(brr.get(i)+" -");
                    // a.add(brr.get(i));
                    j=arr.size();
                }  
            }
            System.out.println();
        }
        System.out.println(arr);
        // return a;
    }
}
