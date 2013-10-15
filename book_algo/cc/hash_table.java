/*
Learnt about Arraylist and stringbuffer
*/
import java.util.* ;

public class hash_table {
	
	public static ArrayList<String> func(String[] s,String[] w){
		ArrayList<String> sent = new ArrayList<String> ();
		for(String s1:s) sent.add(s1);
	    for(String s2:w) sent.add(s2);
	    return sent;
	}
	
	
	public static String make_func(String[] s){
		StringBuffer sent = new StringBuffer();
		for(String s1:s) sent.append(s1);
		System.out.println(sent);
	    return sent.toString();
	}
	
    public static void main(String[] args) {
        //declare and initialize one dimension array
        String[] names = new String[]{"mahendra", "anu", "girish", "komal"};
        String[] words = new String[]{"maendra", "au", "grish", "koal"};
        System.out.println("These are elements of one Dim array.");
        ArrayList<String> sent = new ArrayList<String> ();
        sent = func(names,words);
        make_func(words);
        System.out.print(sent);
        int i=3;
        System.out.print((int)i*2.5/3.0);
        
        
    }
}