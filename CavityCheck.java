import java.util.*;
public class CavityCheck {
    public static void main(String[] args) {
        ArrayList<String> grid=new ArrayList<>();
        ArrayList<String> result=new ArrayList<>();

        grid.add("1112");
        grid.add("1912");
        grid.add("1892");
        grid.add("1234");


        for(int i=0;i<grid.size();i++)
        {
            if(i==0 || i==grid.size()-1)
            {
                result.add(grid.get(i));
            }
            else
            {
                String s=grid.get(i);
                String str="";
                for(int j=0;j<s.length();j++)
                {
                    if(j==0 || j==s.length()-1)
                    {
                        str=str+s.charAt(j);
                    }
                    else{
                        int topEle=grid.get(i-1).charAt(j) - '0';
                        int bottomEle=grid.get(i+1).charAt(j) - '0';
                        int leftEle=s.charAt(j-1)-'0';
                        int rightEle=s.charAt(j+1)-'0';
                        int currEle=s.charAt(j)-'0';
                        // System.out.println(topEle+" - "+bottomEle+" - "+leftEle+" - "+rightEle+"");
                        // System.out.println(currEle);
                        if(currEle>topEle && currEle>bottomEle && currEle>leftEle && currEle>rightEle)
                        {
                            str=str+'X';
                        }
                        else
                        {
                            str=str+s.charAt(j);
                        }

                    }
                }
                result.add(str);
            }
        }
        System.out.println(result);

    }
}
