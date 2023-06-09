import java.util.Arrays;
public class LeetCodeProblem2
{
    public static void main(String[] args) {
        String event1[]={"01:00","02:00"};
        String event2[]={"01:20","03:00"};
        float arr1[]=new float[event1.length];
        float arr2[]=new float[event1.length];

        for(int i=0;i<event1.length;i++)
        {
            String s=event1[i];
            String s2=event2[i];
            StringBuilder sb=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==':' && s2.charAt(j)==':')
                {
                    sb.append('.');
                    sb2.append('.');

                }
                else{
                    sb.append(s.charAt(j));
                    sb2.append(s2.charAt(j));
                }
            }
            arr1[i]=Float.parseFloat(sb.toString());
            arr2[i]=Float.parseFloat(sb2.toString());
        }
        if(arr2[0]<=arr1[1] && arr2[0]>=arr1[0])
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}