import java.util.ArrayList;

public class SherlockNArray
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        // arr.add(1);

        int prevSum=0;
        int nowSum=0;
        int totalSum=0;

        boolean check=false;

        for(int i=0;i<arr.size();i++)
        {
            totalSum+=arr.get(i);
        }

        for(int i=0;i<arr.size();i++)
        {
            nowSum+=arr.get(i);
            if(prevSum==totalSum-nowSum)
            {
                check=true;
                break;
            }
            prevSum=nowSum;
        }
        if(check==false) System.out.println("NO");
        else System.out.println("YES");
    }
}
