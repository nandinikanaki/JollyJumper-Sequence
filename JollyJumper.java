import java.util.*;
public class JollyJumper
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        boolean visited[]= new boolean[n];
        int i,diff;
        boolean Isjolly=true;
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        if(n==1)
            {
             System.out.print("Jolly Jumper");
                return;
            }
        for (i=0;i<n-1;i++)
        { 
            diff=Math.abs(arr[i]-arr[i+1]);
                if(diff<1 || diff>n-1||visited[diff])
                    {
                          System.out.print("Is not Jolly Jumper");
                          return;
                    }
            visited[diff]=true;
        }
        for(i=0;i<n;i++)
        {
            if (visited[i]==true)
            {
               Isjolly=true;
            }
        }
        if(Isjolly)
        {
             System.out.print("Jolly");
        }
        else
        {
             System.out.print("not Jolly");
        }
        
	}
	
}