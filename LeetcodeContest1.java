import java.util.HashMap;

public class LeetcodeContest1 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=783;
        int temp1=2*n;
        int temp2=3*n;
        String str=Integer.toString(n)+Integer.toString(temp1)+Integer.toString(temp2);
        System.out.println(str);
        if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6") && str.contains("7") && str.contains("8") && str.contains("9"))
        {
            for(int i=0;i<str.length();i++)
            {
                if(!hm.containsKey(str.charAt(i)))
                {
                    hm.put(str.charAt(i),1);
                }
                else{
                    System.out.println("FALSE");
                }
            }
            // System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
