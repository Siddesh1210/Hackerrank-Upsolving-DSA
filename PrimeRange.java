public class PrimeRange {
    public static void main(String[] args) {
        int count=0;
        int n=10;
        for(int i=2;i<=n;i++)
        {
            boolean check=isPrime(i);
            if(check==true) count++;
        }
        System.out.println(count);
    }
        
    public static boolean isPrime(int k)
    {
        boolean setPrime=true;
        for(int i=2;i<=Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                setPrime=false;
                break;
            }
        }
        if(setPrime==true)
            {
                // System.out.println(k+" : Prime No");
                return true;
                // count++;
            }
        else
            {
                return false;
                // System.out.println(k+" : Not Prime NO");
            }
        }
}
