import java.util.ArrayList;
public class BlankSpacelc {
    public static void main(String[] args) {
        String s="  hello world  ";
        s=s+" ";
        int temp=0;
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.println(temp+" : "+i);
                    ar.add(s.substring(temp,i));
                temp=i+1;
            }
        }
        String str="";
        for(int i=0;i<ar.size();i++)
        {
            ar.remove(String.valueOf(""));
        }
        // ar.size();
        // System.out.println(ar.size());
        for(int i=ar.size()-1;i>=0;i--)
        {
            // System.out.print(ar.get(i)+",");
            if(ar.get(i)!="")
            {
                str+=ar.get(i);
                if(i!=0)
                {
                    str+=" ";
                }
            //     System.out.println(ar.get(i)+",");
            }
        }
        // System.out.println(ar.size());
        System.out.println(str+" "+str.length());
    }
}
