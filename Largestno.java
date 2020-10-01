class Largestno
{
    public static void main(String [] args)
    {
      int a=Integer.parseInt(args[0]);
      int b=Integer.parseInt(args[1]);        
      int c=largest(a,b);
        System.out.println("The number is:-"+c);
    }
    public static int largest(int n1 , int n2)
    {
        if(n1>n2)
        return n1;
        else
        return n2;
    }
}
