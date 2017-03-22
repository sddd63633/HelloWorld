//import static netscape.security.Privilege.add;

/**
 * Created by Lyao on 2017/3/22.
 */
public class HelloJDB {
    public static class ADD
    {
        public static int add(int a,int b)
        {
            return a+b;
        }
    }
    public static void main(String[] args) {
        int i=5;
        int j=6;
        int sum = ADD.add(i,j);
        System.out.println(sum);

        sum=0;
        for(i=0;i<100;i++)
            sum += i;

            System.out.println(sum);
    }
}
