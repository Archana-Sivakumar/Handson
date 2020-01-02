class Fibonacci{
     public static void main(String args[])
        {
          int a=0,b=1,c,i,n=15;
          System.out.print(a+ " " +b+" ");
          for(i=2;i<n;i++){
             c=a+b;
             System.out.print(c+" ");
             a=b;
             b=c;
          }

        }
}