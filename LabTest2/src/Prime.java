
public class Prime  
{
    void primeNumber(int n)
      {
    	int i,count;
       System.out.println("Prime numbers between 1 to "+n+" are ");
       
       for(int j=2;j<=n;j++)
          {
            count=0;
            for(i=1;i<=j;i++)
             {
               if(j%i==0)
               {
               count++;        
               }
             }
           if(count==2)
           System.out.print(j+"  "); 
           
           }

	   }
	public static void main(String[] args) 
	{
		Prime pn=new Prime();
		pn.primeNumber(20);
	}

}
