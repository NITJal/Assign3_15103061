import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class WordFrequency {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scan.nextLine();
		scan.close();
		String s1[]=s.split(" ");
		TreeMap<String,Integer>m=new TreeMap<String,Integer>();
		for(int i=0;i<s1.length;i++)
		{
			if(!m.containsKey(s1[i]))
				m.put(s1[i],1);
			else
				m.put(s1[i],m.get(s1[i])+1);
		}
		Comparator <String> comp=new Comparator<String> ()
		{
				public int compare(String a,String b) {
						if(m.get(b)==(m.get(a)) || m.get(b)>(m.get(a)))
							return 1;
						else
							return -1;
				}
		};
		TreeMap<String,Integer>m1=new TreeMap<String,Integer>(comp);
		m1.putAll(m); 
		for(Map.Entry<String,Integer> entry: m1.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
