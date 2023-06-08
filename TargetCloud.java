public class TargetCloud {
    public static void main(String[] args) {
        int c[]={0,0,1,0,0,1,1,0};
        int k=2;
        int e=100;
        int targetCloud=k;
        while(targetCloud!=0)
        {
            e=e-1;
            if(c[targetCloud]==1) e=e-2;
            System.out.print(targetCloud+" -> "+e+",");
            targetCloud=targetCloud+k;
            if((targetCloud)==c.length)
            {
                e=e-1;
                if(c[targetCloud-c.length]==1) e=e-2;
                System.out.print((targetCloud-c.length)+" -> "+e+",");
                break;
            }
            if(targetCloud>c.length)
            {
                targetCloud=targetCloud-c.length;
            }
        }
        System.out.println();
        System.out.print("The energy left is : "+e);
    }
}
