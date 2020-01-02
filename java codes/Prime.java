class Prime{
     public static void main(String args[])
     {
      int i,j,sum=0;
      for(i=1;i<=100;i++)
      { 
         int flag=0;
         for(j=2;j<=i/2;j++)
            {  
            if(i%j==0)
              {
                 flag=1;
                 break;
              }
            }
         if(flag==0 && i!=1)
           {
             sum=sum+i;
           }
      }
      System.out.println(sum);
     }
}