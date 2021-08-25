
public class akv0 {

	public static void main(String[] args) {
		String d ="1025656-152 ";
		int i = d.length();
		////
		char[] c = d.toCharArray(); // string to char
		for (int p = 0; p < i; p++) {
		  c[p] = Integer.valueOf(c); // char to int
            System.out.print(c[p]+" ");
        }	
	    ////
		if (i>2 & i<232-1)	
		System.out.println(c);		
		else
		System.out.println("number " +i  +" must be between 2 and 231");
		
	}
	
	

}