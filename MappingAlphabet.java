import java.util.ArrayList;
import java.util.HashMap;

public class MappingAlphabet {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        HashMap<Character,String> hm=new HashMap<>();

        String digits="";
        
        hm.put(' ',"");
        hm.put('1',"");
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        if(digits.length()==0) arr.add("");
         
    } 
}
