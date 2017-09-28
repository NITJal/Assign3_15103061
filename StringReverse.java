import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scan.nextLine();
		String a[]=s.split(" ");
		scan.close();
		String q=new String();
		for(int i=0;i<a.length;i++)
		{
			String b=a[i];
			for(int j=b.length()-1;j>=0;j--)
				q+=b.charAt(j);
			q+=" ";
		}
		System.out.println(q);
	}

}
