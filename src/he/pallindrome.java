package he;
import java.util.*;

class pallindrome
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<T; i++)
		{
			String str = in.nextLine();
			
			String rev = new StringBuilder(str).reverse().toString();
			
			if(str.equals(rev))
			{
				if(str.length()%2 == 0)
					System.out.println("YES EVEN");
				else
					System.out.println("YES ODD");
			}
			else
					System.out.println("NO");
		}
	}
}