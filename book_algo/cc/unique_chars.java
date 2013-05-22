import java.util.* ;
public class unique_chars {
		
		
		public static void main(String[] args){ 
	    String input = "fishfishredfishbluefish";
	    String input2 = "abcedf";
	    while(true){
	    Scanner s = new Scanner(System.in);
	    String input3;
	    int checker = 0;
		for(int i=0;i<input2.length();i++){
			int val = input2.charAt(i)-'a';
			if((checker & (1<<val)) > 0)
				System.out.println("False");
			checker = checker | (1<<val);
		}
		
		char[] temp ={'a','b','c','d'};
		char[] temp2=new char[7];
		
		System.arraycopy(temp,0,temp2,0,4);
		System.out.println(new String(temp2));
		
		System.out.println("True");
		s.close();
		}
	}
}
