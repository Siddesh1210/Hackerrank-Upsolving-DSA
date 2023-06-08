public class StringMerger {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";

        StringBuilder sb=new StringBuilder("");
            for(int i=0;i<word1.length();i++)
            {
                sb.append(word1.charAt(i));
                for(int j=i;j<word2.length();j++)
                {
                    sb.append(word2.charAt(j));
                    j=word2.length();
                }
            }
            if(word1.length()<word2.length())
            {
                sb.append(word2.substring(word1.length(),word2.length()));
            }
            System.out.println(sb.toString());
    }
}
