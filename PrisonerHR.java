public class PrisonerHR {
    public static void main(String[] args) {
        int n=7;
        int m=116507988;
        int s=3;
        m=m%n;
        s=s+m-1;
        while(s>n)
        {
            s=s-n;
        }
        System.out.println(s);
    }
}
