import java.util.Scanner;

public class CircularShiftString {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a string: ");
			String s=scan.next();
			String s1="";
			int c=s.length();
			while(c--!=0)
			{
				s1+=s.charAt(s.length()-1);
				for(int j=0;j<s.length()-1;j++)
					s1+=s.charAt(j);
				System.out.println(s1);
				s=s1;
				s1="";
			}
			scan.close();
	}

}
