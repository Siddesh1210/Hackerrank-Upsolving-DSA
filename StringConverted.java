import javax.sound.sampled.SourceDataLine;

public class StringConverted {
    public static void main(String[] args) {
        String s="-4193 with words";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57) sb.append(s.charAt(i));
            else if(s.charAt(i)=='-' || s.charAt(i)=='+') sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
        
}
