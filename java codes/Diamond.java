class Diamond{
      public static void main(String args[])
        {
          int i,l=3,s=1,d=1,j;
          for(i=1;i<=3;i++)
             {
               for(j=1;j<l;j++){
                  System.out.print(" ");
               }
               int m=0;
               for(int k=1;k<=s;k++){
                  if(k>d)
                    {
                      m--;
                      System.out.print(m);
                    }
                  else
                    {
                      m++;
                      System.out.print(m);
                    }
               }
               d++;
               l--;
               s+=2;
               System.out.println();
             }
          l=2;d=2;s=3;
          for(i=1;i<=2;i++)
             {
               for(j=1;j<l;j++){
                  System.out.print(" ");
               }
               int m=0;
               for(int k=1;k<=s;k++){
                  if(k>d)
                    {
                      m--;
                      System.out.print(m);
                    }
                  else
                    {
                      m++;
                      System.out.print(m);
                    }
               }
               d--;
               l++;
               s-=2;
               System.out.println();
             }
         }
}          