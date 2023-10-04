public class Largest
{
    public static void main(String[] args)
    {
        int a=100;
        int b=80;
        int c=30;
        if(a>b) {
            if(a>c) {
                System.out.println("a is greater");
            }else {
                System.out.println("b is greater");
            }
        }
        else if(b>c) {
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

    }

}
