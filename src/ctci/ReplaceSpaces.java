package ctci;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String s = "Mr John Smith    ";
//		replacespaces(s.toCharArray(), 13);
		replacespaces_4mstart(s.toCharArray(), 13);

	}

	static void replacespaces(char[] s, int tl) {

		int spaces = 0;
		for (int i = 0; i < tl; i++) {
			if (s[i] == ' ')
				spaces++;
		}
		
		int new_index = tl+spaces*2;
		
		for(int i=tl-1; i>0; i--)
		{
			if(s[i] == ' ')	{
				s[new_index-1] = '0';
				s[new_index-2] = '2';
				s[new_index-3] = '%';
				new_index = new_index-3;
			}
			else {
				s[new_index-1] = s[i];
				new_index = new_index -1;
			}
		}
		
		System.out.println("new string is--->"+ String.valueOf(s));

	}
	
	static void replacespaces_4mstart(char[] s, int tl) {

		for (int i = 0; i < tl; i++) {
			if (s[i] == ' ') {
			}
		}
		
		int index = 0;
		
		for(int i=0; i<tl; i++)
		{
			if(s[index] == ' ')	{
				s[index] = '%';
				s[index+1] = '2';
				s[index+2] = '0';
				index = index+3;
			}
			else {
				s[index] = s[i];
				index = index+1;
			}
			
			System.out.println("new string is--->"+ String.valueOf(s));
		}
		
		System.out.println("new string is--->"+ String.valueOf(s));

	}
}
