import java.util.* ;
public class duplicate {
	public static void remove_dup(String inp){
		int check=0;
		char[] ch = new char[inp.length()];
		for(int i=0;i<inp.length();i++){
		   int val = inp.charAt(i)-'a';
		   if((check & (1<<val)) > 0){
			  System.out.println(ch[i]);
			  ch[i]=' ';
		   }
		   else
			  check = check | (1<<val);
		}
		for(int i=0;i<inp.length();i++)
			System.out.print(ch[i]);
			System.out.println();
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String inp;
		inp = s.nextLine();
		remove_dup(inp);	
	}
}
