import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scan.next();
		char s1[]=s.toCharArray();
		scan.close();
		int count[]=new int[256];
		for(int i=0;i<256;i++)
			count[i]=0;
		for(int i=0;i<s.length();i++)
			count[s1[i]]++;
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
			{
				System.out.print((char)i+" = ");
				System.out.println(count[i]);
			}
		}
	}

}
